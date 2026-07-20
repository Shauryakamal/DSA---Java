package BinarySearch.Basics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int k = 38;
        int low = 0;
        int high = arr.length - 1;
        boolean isfound = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k ) {
                System.out.println("element found: " + k + " at index: " + mid);
                isfound = true;
                break;
            }
            else if (k > arr[mid]) {
                low = mid + 1;
            }
            else  {
                high = mid - 1;
            }
        }
        if (!isfound) {
            System.out.println("element not found");
        }

    }
}
