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

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        ListNode a = l1;
        ListNode b = l2;

        int carry = 0;

        while (a != null || b != null) {
            int sum = carry;

            if (a != null) {
                sum += a.val;
                a = a.next;
            }

            if (b != null) {
                sum += b.val;
                b = b.next;
            }
            carry = sum / 10;
            int digit = sum % 10;
            current.next = new ListNode(digit);
            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        AddTwoNumbers obj = new AddTwoNumbers();

        // l1 = 2 → 4 → 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // l2 = 5 → 6 → 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = obj.addTwoNumbers(l1, l2);

        // Print result
        ListNode current = result;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
