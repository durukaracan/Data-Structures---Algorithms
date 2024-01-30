public class AVLTree {
    Node root;


    //INSERT
    public void insert(int data) {
        root = insertHelper(root, data);
    }

    private Node insertHelper(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertHelper(root.left, data);
        } else if (data > root.data) {
            root.right = insertHelper(root.right, data);
        } else {
            // Duplicate values are not allowed in AVL, handle accordingly.
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        return balance(root);
    }



    //BALANCE
    private Node balance(Node root) {
        int balanceFactor = getBalance(root);

        // Left Heavy
        if (balanceFactor > 1) {
            if (getBalance(root.left) < 0) {
                root.left = leftRotate(root.left);
            }
            return rightRotate(root);
        }
        // Right Heavy
        else if (balanceFactor < -1) {
            if (getBalance(root.right) > 0) {
                root.right = rightRotate(root.right);
            }
            return leftRotate(root);
        }

        return root;
    }

    private int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }




    //DELETE
    public void delete(int data) {
        if (search(data)) {
            root = deleteHelper(root, data);
            System.out.println(data + " has been deleted.");
        } else {
            System.out.println(data + " could not be found.");
        }
    }

    private Node deleteHelper(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteHelper(root.left, data);
        } else if (data > root.data) {
            root.right = deleteHelper(root.right, data);
        } else {
            // Node found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // If the node has two children, get the inorder successor
            root.data = minValue(root.right);
            root.right = deleteHelper(root.right, root.data);
        }

        // Update height of the current node
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Perform rotation if needed to maintain AVL property
        return balance(root);
    }

    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }




    //SEARCH
    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }




    //DISPLAY
    public void display() {
        displayHelper(root);
        System.out.println();
    }

    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.print(root.data + " ");
            displayHelper(root.right);
        }
    }

}
