public class SimpleTree {
    private Node root;
    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void traverseInOrder(Node node) { // ітерація по дереву
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }
}