package SlidingWindow;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            int currentMin = minStack.peek();
            minStack.push(Math.min(value, currentMin));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Top: " + minStack.top());
        System.out.println("Minimum: " + minStack.getMin());

        minStack.pop();

        System.out.println("After pop:");
        System.out.println("Top: " + minStack.top());
        System.out.println("Minimum: " + minStack.getMin());
    }
}
