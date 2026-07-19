package Arrays.Medium;

public class concatination {
    public static void main(String[] args){
        int[] arr = {1,2,1};
        int[] ans = new int[arr.length * 2];
        for(int i = 0; i<arr.length; i++){
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];

        }
        for(int i = 0; i<ans.length; i++){
            System.err.println("new array is: " + ans[i]);
        }
    }
    
}
