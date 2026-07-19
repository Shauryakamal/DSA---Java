package Arrays.Easy;

public class movezero {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        int[] ans = new int[arr.length];
        int k = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] != 0){
                ans[k] = arr[i];
                k++;
            }
        }
        for(int i=0; i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    
}
