package BinarySearch.Medium;

public class MinimuminRotatedSortedArray {

    public static int findMin(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Compare nums[mid] with nums[high]

            if (arr[mid] > arr[high]) {

                low = mid + 1;

            } else {

                // Minimum left side me hai (including mid)

                high = mid;

            }
        }

        return arr[low];
    }
    public static void main(String[] args){
        int[] result = {4,5,6,7,0,1,2};
        int ans = findMin(result);
        System.out.println(ans);
    }
}
