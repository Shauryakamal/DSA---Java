package Arrays.Easy;
public class intersection {
    public static void main(String[] args){
        int[] arr1 = {1,2,2,3,4,5};
        int[] arr2 = {2,2,3,5,6};
        int i = 0;
        int j = 0;
        for( i =0, j=0; i<arr1.length && j<arr2.length; ){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr2[j] < arr1[i]){
                j++;
            }else{
                System.err.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
    
}
