import java.util.Stack;
import java.util.Arrays;

public class ExpressionTree {

    public static Node buildTree(String postfix) {
        Stack<Node> stack = new Stack<>();
        Node t, t1, t2;

        for (int i = 0; i < postfix.length(); i++) {
            if (!Character.isLetterOrDigit(postfix.charAt(i))) {
                t = new Node(postfix.charAt(i));
                t1 = stack.pop();
                t2 = stack.pop();
                t.right = t1;
                t.left = t2;
                stack.push(t);
            } else {
                t = new Node(postfix.charAt(i));
                stack.push(t);
            }
        }

        t = stack.peek();
        stack.pop();

        setLevel(t, 0);
        return t;
    }

    public static int treeHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = treeHeight(node.left);
            int rightHeight = treeHeight(node.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    private static void setLevel(Node node, int level) {
        if (node != null) {
            node.level = level;
            setLevel(node.left, level + 1);
            setLevel(node.right, level + 1);
        }
    }

    public static void printTree(Node node) {
        int height = treeHeight(node);
        int width = (int) Math.pow(2, height) - 1;
        char[][] grid = new char[height][width];

        for (char[] row : grid) {
            Arrays.fill(row, ' ');
        }

        fillGrid(grid, node, 0, 0, width);

        for (char[] row : grid) {
            System.out.println(new String(row));
        }
    }

    private static void fillGrid(char[][] grid, Node node, int level, int left, int right) {
        if (node == null) {
            return;
        }
        int mid = (left + right) / 2;
        grid[level][mid] = node.value;

        fillGrid(grid, node.left, level + 1, left, mid);
        fillGrid(grid, node.right, level + 1, mid + 1, right);
    }

    public static void main(String[] args) {

        Node root1 = buildTree("12+34-*");
        System.out.println("example tree 1:");
        printTree(root1);
        System.out.println();

        Node root2 = buildTree("12+356/-*");
        System.out.println("example tree 2:");
        printTree(root2);
        System.out.println();

        Node root3 = buildTree("12+3+578/-*");
        System.out.println("example tree 3:");
        printTree(root3);
    }
}