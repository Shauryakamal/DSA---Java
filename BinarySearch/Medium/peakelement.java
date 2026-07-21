package BinarySearch.Medium;

public class peakelement {

    public static int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 1 };

        int result = findPeakElement(nums);

        System.out.println("Peak Index: " + result);
        System.out.println("Peak Value: " + nums[result]);
    }
}
