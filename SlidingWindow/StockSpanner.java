package SlidingWindow;

import java.util.Stack;

public class StockSpanner {
    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() &&
                stack.peek()[0] <= price) {
            int[] popped = stack.pop();
            span += popped[1];
        }
        stack.push(new int[] { price, span });
        return span;
    }

    public static void main(String[] args) {

        StockSpanner stockSpanner = new StockSpanner();

        int[] prices = { 100, 80, 60, 70, 60, 75, 85 };

        for (int price : prices) {

            int result = stockSpanner.next(price);

            System.out.println(
                    "Price: " + price + " | Span: " + result);
        }
    }
}
