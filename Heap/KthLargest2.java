package Heap;

import java.util.PriorityQueue;

public class KthLargest2 {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] ans = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        KthLargestElementHeap obj = new KthLargestElementHeap();
        int result = obj.findKthLargest(ans, k);
        System.out.println(result);
    }
}
