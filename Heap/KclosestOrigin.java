package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KclosestOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = { { 1, 3 }, { -2, 2 }, { 5, 8 }, { 0, 1 } };
        int k = 2;
        int[][] Closest1 = kClosest(points, k);
        for (int[] point : Closest1) {
            System.out.println(Arrays.toString(point));
        }
    }
}
