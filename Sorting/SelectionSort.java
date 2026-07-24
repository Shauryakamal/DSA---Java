package Sorting;

public class SelectionSort {
    public static void selectionSort2(int[] arr){
        for(int i =0; i<arr.length; i++){
            int mindIndex = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[j] < arr[mindIndex]){
                    mindIndex = j;
                }
            }
            int temp = arr[mindIndex];
            arr[mindIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] ans = {4,2,6,3,1,7};
        selectionSort2(ans);
        printArray(ans);
    }
}
