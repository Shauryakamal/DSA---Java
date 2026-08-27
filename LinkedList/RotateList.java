package LinkedList;

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {

        // Step 1: Empty list ya single node hai
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 2: List ki length find karo
        int length = 0;
        ListNode current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 3: Extra rotations remove karo
        k = k % length;

        // Agar k = 0 ho gaya, rotation ki zarurat nahi
        if (k == 0) {
            return head;
        }

        // Step 4: Last node tak jao
        current = head;

        while (current.next != null) {
            current = current.next;
        }

        // Step 5: Last node ko head se connect karo
        // List circular ban gayi
        current.next = head;

        // Step 6: New tail ki position find karo
        int steps = length - k;

        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Step 7: New head = newTail ke next
        ListNode newHead = newTail.next;

        // Step 8: Circular list ko break karo
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {

        RotateList obj = new RotateList();

        // 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        head = obj.rotateRight(head, k);

        // Print result
        ListNode current = head;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}