package Heap;

import java.util.Collections;
import java.util.PriorityQueue;


public class PriorityQueueBasics {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);

        System.out.println("Min Heap Peek: " + minHeap.peek());

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);

        System.out.println("Max Heap Peek: " + maxHeap.peek());
    }
}
