package LinkedList;

import java.util.HashMap;

class RandomNode {
    int val;
    RandomNode next;
    RandomNode random;

    RandomNode(int val) {
        this.val = val;
    }
}

public class CopyRandomList {
    public RandomNode copyRandomList(RandomNode head) {
        if (head == null) {
            return null;
        }
        HashMap<RandomNode, RandomNode> map = new HashMap<>();
        RandomNode current = head;

        while (current != null) {
            RandomNode copy = new RandomNode(current.val);
            map.put(current, copy);
            current = current.next;
        }
        current = head;
        while (current != null) {
            RandomNode copy = map.get(current);
            copy.next = map.get(current.next);
            copy.random = map.get(current.random);
            current = current.next;
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        CopyRandomList obj = new CopyRandomList();

        // 1 → 2 → 3
        RandomNode head = new RandomNode(1);
        head.next = new RandomNode(2);
        head.next.next = new RandomNode(3);

        // Random pointers
        head.random = head.next.next; // 1 → 3
        head.next.random = head; // 2 → 1
        head.next.next.random = head.next; // 3 → 2

        RandomNode result = obj.copyRandomList(head);

        // Print copied list
        RandomNode current = result;

        while (current != null) {

            System.out.println(
                    "Value: " + current.val +
                            ", Random: " +
                            (current.random != null
                                    ? current.random.val
                                    : "null"));

            current = current.next;
        }
    }
}
