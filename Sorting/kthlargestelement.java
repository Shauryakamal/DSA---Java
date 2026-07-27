package Sorting;

public class kthlargestelement {
    public int findkthlargest(int[] arr,int k){
        quicksort(arr, 0, arr.length - 1);
        return arr[arr.length - k];
    }
    public static void quicksort(int[] arr,int low, int high){
        if(low < high){
            int pivotIndex = partition(arr,low,high);
            quicksort(arr,low,pivotIndex - 1);
            quicksort(arr,pivotIndex + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i= low - 1;
        for(int j = low; j<high; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1,high);
        return i + 1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] ans = {3,2,1,5,6,4};
        int k = 2;
        quicksort(ans, 0, ans.length - 1);
        System.out.println(ans[ans.length - k]);
    }
}
