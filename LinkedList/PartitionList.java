package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode Next) {
        this.val = val;
        this.next = next;
    }
}

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);

        ListNode small = smallDummy;
        ListNode large = largeDummy;
        ListNode current = head;

        while (current != null) {
            if (current.val < x) {
                small.next = current;
                small = small.next;
            } else {
                large.next = current;
                large = large.next;
            }
            current = current.next;
        }
        large.next = null;

        small.next = largeDummy.next;

        return smallDummy.next;
    }

    public static void main(String[] args) {

        PartitionList obj = new PartitionList();

        // 1 → 4 → 3 → 2 → 5 → 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        int x = 3;

        head = obj.partition(head, x);

        // Print result
        ListNode current = head;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
