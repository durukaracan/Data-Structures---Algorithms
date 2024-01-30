
class Node {
    char value;
    Node left, right;
    int level;

    Node(char item) {
        value = item;
        left = right = null;
        level = -1;
    }
}