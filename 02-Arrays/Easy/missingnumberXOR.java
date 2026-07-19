package Arrays.Easy;
public class missingnumberXOR {
    public static void main(String[] args){
        int[] arr = {4,0,1,2};
        int n = arr.length;
        int xor = 0;
        for(int i =0; i<=n;i++){
            xor = xor ^ i; 
        }
        for(int i =0; i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        System.err.println(xor);
    }
}
