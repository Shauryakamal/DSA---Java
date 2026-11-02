package SlidingWindow;

import java.util.Stack;

public class LargestRectangleArea {
    public static int largestRectangleArea(int[] heights){
        int n = heights.length;
        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<=n; i++){
            int currHeight = (i==n) ? 0 : heights[i];
            while(!stack.isEmpty() &&
             currHeight < heights[stack.peek()]){
               int poppedIndex = stack.pop();

               int height = heights[poppedIndex];
                int leftSmaller = stack.isEmpty() ? -1 : stack.peek();

                int rightSmaller = i;

                int width = rightSmaller - leftSmaller - 1;

                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }
            if(i < n){
                stack.push(i);
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        int[] heights = {2,1,5,6,2,3};
        int result = largestRectangleArea(heights);
        System.out.println("Largest Rectangle Area: " + result);
    }   
}
