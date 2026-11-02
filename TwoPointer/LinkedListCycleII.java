package TwoPointer;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        /*
         * 3 → 2 → 0 → -4
         * ↑ ↓
         * ← ← ← ← ←
         * 
         * Cycle starts at 2
         */

        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create cycle
        node4.next = node2;

        ListNode result = detectCycle(head);

        if (result != null) {
            System.out.println("Cycle starts at: " + result.val);
        } else {
            System.out.println("No cycle");
        }
    }
}
