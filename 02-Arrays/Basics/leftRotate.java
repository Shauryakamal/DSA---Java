package Arrays.Basics;

public class leftRotate {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int temp = arr[0];
        for(int i = 0; i<arr.length-1;i++){
            temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
