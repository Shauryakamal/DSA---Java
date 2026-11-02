package SlidingWindow;

import java.util.Arrays;
import java.util.Stack;

public class SumSubArrayMin {
    public static int sumSubArrayMins(int[] arr) {
        final int MOD = 1_000_000_007;
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        System.out.println("PSE: " + Arrays.toString(left));
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = stack.peek();
            }
            stack.push(i);
        }
        System.out.println("NSE: " + Arrays.toString(right));
        long sum = 0;

        for (int i = 0; i < n; i++) {

            long leftCount = i - left[i];
            long rightCount = right[i] - i;

            long contribution = (long) arr[i] * leftCount * rightCount;

            sum = (sum + contribution) % MOD;

            System.out.println(
                    "Element: " + arr[i] +
                            " | Contribution: " + contribution);
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1 };
        int result = sumSubArrayMins(arr);
        System.out.println("final sum: " + result);
    }
}
