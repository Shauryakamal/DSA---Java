package SlidingWindow;

import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") ||
                    token.equals("-") ||
                    token.equals("*") ||
                    token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;

                    case "*":
                        stack.push(a * b);
                        break;

                    case "/":
                        stack.push(a / b);
                        break;
                    default:
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.peek();
    }

    public static void main(String[] args) {

        String[] tokens = { "2", "1", "+", "3", "*" };

        int result = evalRPN(tokens);

        System.out.println("Result: " + result);
    }
}
