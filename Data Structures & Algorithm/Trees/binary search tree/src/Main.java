public class Main {
    public static void main(String[] args) {
       BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(8));
        tree.insert(new Node(4));
        tree.insert(new Node(2));
        tree.insert(new Node(12));
        tree.insert(new Node(6));
        tree.insert(new Node(10));
        tree.insert(new Node(14));


        System.out.println("ilk hali");
        tree.displayPreorder();
        System.out.println();
        tree.display();

        System.out.println(tree.search(11));

        System.out.println();

        System.out.println("removed hali");
        tree.remove(12);
        tree.display();

    }
}