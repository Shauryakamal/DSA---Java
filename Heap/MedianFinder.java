package Heap;

import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
    }

    public void addNum(int num) {
        maxHeap.offer(num);
        // <=
        if (!maxHeap.isEmpty() && !minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            int val = maxHeap.poll();
            minHeap.offer(val);
        }
        // size
        if (maxHeap.size() > minHeap.size() + 1) {
            int val = maxHeap.poll();
            minHeap.offer(val);
        }
        if (minHeap.size() > maxHeap.size() + 1) {
            int val = minHeap.poll();
            maxHeap.offer(val);
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        } else if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        System.out.println(mf.findMedian()); // 1.0

        mf.addNum(2);
        System.out.println(mf.findMedian()); // 1.5

        mf.addNum(3);
        System.out.println(mf.findMedian()); // 2.0

        mf.addNum(4);
        System.out.println(mf.findMedian()); // 2.5

        mf.addNum(5);
        System.out.println(mf.findMedian()); // 3.0
    }
}
