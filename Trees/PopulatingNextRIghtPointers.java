package Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class PopulatingNextRIghtPointers {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                if (i < size - 1) {
                    current.next = queue.peek();
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {

        PopulatingNextRIghtPointers obj = new PopulatingNextRIghtPointers();

        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        obj.connect(root);

        // Print next pointers
        System.out.println(root.next); // null
        System.out.println(root.left.next.val); // 3
        System.out.println(root.left.left.next.val); // 5
        System.out.println(root.left.right.next.val); // 6
        System.out.println(root.right.left.next.val); // 7
        System.out.println(root.right.right.next); // null
    }
}
