package Arrays.Easy;
public class maximumconsecutive {
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        int k = 0;
        int max = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] == 1){
                k++;
                max = Math.max(max, k);
            }else{
                k = 0;
            }
        }
        System.err.println(max);
    }
    
}
