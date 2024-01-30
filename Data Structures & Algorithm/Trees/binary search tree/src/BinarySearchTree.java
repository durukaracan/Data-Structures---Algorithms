public class BinarySearchTree {
    Node root;

    public void insert(Node node){
        root = insertHelper(root,node);
    }
    private Node insertHelper(Node root, Node node) {

        int data = node.data;

        if(root == null) {
            root = node;
            return root;
        }
        else if(data < root.data) {
            root.left = insertHelper(root.left, node);
        }
        else if (data > root.data) {
            root.right = insertHelper(root.right, node);
        }


        return root;
    }

    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node root){
        if(root != null){
            displayHelper(root.left); // increasing order INORDER TRAVERSAL
            System.out.println(root.data);
            displayHelper(root.right);

            /* for decreasing order
                displayHelper(root.right);
                System.out.println(root.data);
                displayHelper(root.left);
             */
        }
    }

    public void displayPreorder() {
        displayPreorderHelper(root);
    }

    private void displayPreorderHelper(Node root) {
        if(root!=null){
            System.out.print(root.data + " ");
            displayPreorderHelper(root.left);
            displayPreorderHelper(root.right);
        }

    }



    public boolean search(int data){

        return searchHelper(root,data);
    }
    private boolean searchHelper(Node root, int data){
        if (root == null){ // is tree is empty
            return false;
        }
        else if (root.data == data) { // we found what we are looking for
            return true;
        } else if (root.data > data) {  // aradığımız şey left de kalıyo
            return searchHelper(root.left, data);
        }
        else {
            return searchHelper(root.right, data);
        }
    }


    public void remove(int data) {

        if(search(data)) {
            removeHelper(root, data);
        }
        else {
            System.out.println(data + " could not be found");
        }
    }
    private Node removeHelper(Node root, int data) {

        if(root == null) {
            return root;
        }
        else if(data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        else { // node found
            if(root.left == null && root.right == null) {
                root = null;
            }
            else if(root.right != null) { //find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else { //find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(Node root) { //bu root un sağ çocuğunun altındaki en küçük değeri bul
        //bir sağ sonra null bulana kadar sol yap
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        System.out.println("succesor: " +root.data );
        return root.data;
    }
    private int predecessor(Node root) {//bu root un sol çocuğunun altındaki en büyük değeri bul
        //bir sol sonra bull bulana kadar sağ yap
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        System.out.println("predecessor: " +root.data );
        return root.data;
    }
}


