package LinkedList;

import java.util.PriorityQueue;

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

public class MergeKList {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!pq.isEmpty()) {
            ListNode smallest = pq.poll();

            current.next = smallest;
            current = current.next;

            if (smallest.next != null) {
                pq.offer(smallest.next);
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        MergeKList obj = new MergeKList();

        // List 1: 1 → 4 → 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        // List 2: 1 → 3 → 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // List 3: 2 → 6
        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        // Array of linked lists
        ListNode[] lists = { list1, list2, list3 };

        // Merge
        ListNode result = obj.mergeKLists(lists);

        // Print result
        ListNode current = result;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
