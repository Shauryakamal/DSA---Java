package Arrays.Easy;
public class secondlargestoptimal {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int max = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondlargest = max;
                max = arr[i];
            }else if(arr[i]>secondlargest && arr[i] != max){
                secondlargest = arr[i];
            }
        }
        if(secondlargest == Integer.MIN_VALUE){
            System.out.println("seconod largest dosen't exist");
        }else{
            System.out.println("max element is: " + max + " second largest element is" + secondlargest);
        }
        
    }
}
