package BinarySearch.Medium;

public class SortedArray {
    public static int search(int[] arr, int target) {

    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

        int mid = low + (high - low) / 2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[low] <= arr[mid]){
           
            if(target >= arr[low] && target < arr[mid]){
                 high = mid - 1;
            }else{
               
                low = mid + 1;
            }
        }else{
             if(target > arr[mid] && target < arr[high]){
                low = mid + 1;
             }else{
                high = mid - 1;
             }
        }

    }
    return -1;
    }
    public static void main(String[] args){
        int[] result = {4,5,6,7,0,1,2};
        int ans = search(result, 0);
        System.out.println(ans);
    }
}
      



