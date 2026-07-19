package Arrays.Easy;
public class unionarray {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};
        int i = 0;
        int j = 0;
        for (i = 0, j = 0; i < arr1.length && j < arr2.length; ) {
            if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            }else if(arr2[j] < arr1[i]){
                System.out.println(arr2[j]);
                j++;
            }else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
        for(int x = i; x<arr1.length;x++){
            System.out.println(arr1[x]);
        }
        for(int y = j; y<arr2.length;y++){
            System.out.println(arr2[y]);
        }
    }
    
}
