package Arrays.Easy;
public class singlenumber {
    public static void main(String[] args){
        int[] arr = {4,1,2,1,2};
        int xor = 0;
        for(int i = 0; i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        System.err.println(xor);
    }
    
}
