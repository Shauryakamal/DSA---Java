package Arrays.Basics;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int k = 40;

        boolean found = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == k){
                System.out.println("element found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    }
    
}
