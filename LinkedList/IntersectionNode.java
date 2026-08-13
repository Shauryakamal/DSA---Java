package LinkedList;
// null pr vh jayega jiski length choti hui hai 

//

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

}

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null) {
                a = headA;
            } else {
                a = a.next;
            }
            if (b == null) {
                b = headB;
            } else {
                b = b.next;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        IntersectionNode obj = new IntersectionNode();
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A: 4 → 1 → 8 → 4 → 5
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B: 5 → 6 → 1 → 8 → 4 → 5
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode result = obj.getIntersectionNode(headA, headB);

        if(result != null){
            System.out.println("Intersection at Node: " + result.val);
        }else{
            System.out.println("No intersection");
        }

    }
}
