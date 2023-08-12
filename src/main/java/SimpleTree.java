import java.util.LinkedList;
import java.util.Queue;

public class SimpleTree {
    Node root;

    public SimpleTree() {
        root = null;
    }

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
        }

        return current;
    }

    public void traverseDepthFirst() {
        traverseDepthFirst(root);
    }

    private void traverseDepthFirst(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            traverseDepthFirst(node.left);
            traverseDepthFirst(node.right);
        }
    }

    public void traverseBreadthFirst() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.value + " ");

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}

