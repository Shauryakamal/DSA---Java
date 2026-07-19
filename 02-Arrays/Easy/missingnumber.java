package Arrays.Easy;
public class missingnumber {
    public static void main(String[] args){
        int[] arr = {4,0,1,2};
        int n = arr.length;
        int expected= n * (n + 1) / 2;
        int actual= 0;
        for(int i =0; i<arr.length;i++){
            actual = actual + arr[i];
        }
        int missing = expected - actual;
        System.err.println(missing);
    }
    
}
