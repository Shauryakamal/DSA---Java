package Recursion.Easy;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 2 != 0){
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args){
        int[] testCases = {1, 16, 10, 1024, 0, -8, 3};

        for(int n : testCases){
            System.out.println(n + " -> " + isPowerOfTwo(n));
        }
    }
}