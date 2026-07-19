package Arrays.Easy;
public class moveze {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        int k = 0;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
        for(int i =0; i<arr.length;i++){
            System.err.println(arr[i]);
        }
    }
}
