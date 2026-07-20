package BinarySearch.Easy;

class Solution {
    public int searchInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;   // yahi hai insertion point
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 3, 5, 6};

        System.out.println(sol.searchInsert(arr1, 5));  // element mil gaya -> 2
        System.out.println(sol.searchInsert(arr1, 2));  // insert at -> 1
        System.out.println(sol.searchInsert(arr1, 7));  // insert at end -> 4
        System.out.println(sol.searchInsert(arr1, 0));  // insert at start -> 0
    }
}
