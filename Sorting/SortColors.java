package Sorting;

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if(nums[mid] == 2)  {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;

            }
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] ans = { 2, 0, 2, 1, 1, 0 };
        sortColors(ans);
        printArray(ans);
    }
}
