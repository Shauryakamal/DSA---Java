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

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            ListNode nextPair = second.next;

            current.next = second;
            second.next = first;
            first.next = nextPair;

            current = first;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        SwapNodesInPairs obj = new SwapNodesInPairs();

        // 1 → 2 → 3 → 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head = obj.swapPairs(head);

        // Print result
        ListNode current = head;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
