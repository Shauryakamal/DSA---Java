package Arrays.Medium;

public class duplicated {
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int k = 0;
        for(int i = 0; i<arr.length; i++){
           if( i == 0 || arr[i] != arr[i-1]){
                arr[k] = arr[i] ;
                k++;
           }
        }
        for(int i = 0; i<k;  i++)
        {
            System.err.println(arr[i]);
        }
    }
}
