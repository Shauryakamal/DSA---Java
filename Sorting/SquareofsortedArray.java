package Sorting;

public class SquareofsortedArray {
    public static void square(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
    }

    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] ans = { 2, 3, 1, 3, 2 };
        square(ans);
        sorting(ans);
        printArray(ans);
    }
}
