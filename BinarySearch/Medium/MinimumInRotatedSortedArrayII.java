package BinarySearch.Medium;

public class MinimumInRotatedSortedArrayII  {
    public static int findMin(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] == arr[low] && arr[mid] == arr[high]){
                low++;
                high--;
            }else if(arr[mid] > arr[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args){
        int[] result = {1,3,5};
        int ans = findMin(result);
        System.out.println(ans);
    }
}
