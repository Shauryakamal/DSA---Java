package Recursion.Basics;

public class reverseString {
    static boolean isPallindrone(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPallindrone(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "malyalam";
        boolean result = isPallindrone(s, 0, s.length() - 1);

        if (result) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
