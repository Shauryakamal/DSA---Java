package SlidingWindow;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            while (!stack.isEmpty() &&
                    stack.peek() <= nums[index]) {
                stack.pop();
            }
            if (i < n) {
                if (!stack.isEmpty()) {
                    ans[index] = stack.peek();
                }
            }
            stack.push(nums[index]);
        }
        return ans;
    }

    public static void main(String[] args) {

        NextGreaterElementII sol = new NextGreaterElementII();

        int[] nums = { 1, 2, 1 };

        int[] result = sol.nextGreaterElements(nums);

        System.out.println(Arrays.toString(result));
    }
}
