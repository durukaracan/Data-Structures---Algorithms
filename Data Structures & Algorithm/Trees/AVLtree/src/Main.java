public class Main {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(30);
        avlTree.insert(15);
        avlTree.insert(5);

        System.out.println("AVL Tree Inorder Traversal:");
        avlTree.display();

        avlTree.delete(21);

        System.out.println("AVL Tree Inorder Traversal after deletion:");
        avlTree.display();
    }
}