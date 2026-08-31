package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;
        while (true) {
            ListNode check = current;
            for (int i = 0; i < k; i++) {
                check = check.next;
                if (check == null) {
                    return dummy.next;
                }
            }
            ListNode first = current.next;
            ListNode previous = check.next;
            ListNode node = first;

            for (int i = 0; i < k; i++) {
                ListNode next = node.next;
                node.next = previous;
                previous = node;
                node = next;
            }
            current.next = previous;

            current = first;
        }
    }

    public static void main(String[] args) {

        ReverseKGroups obj = new ReverseKGroups();

        // 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        head = obj.reverseKGroup(head, k);

        // Print result
        ListNode current = head;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
