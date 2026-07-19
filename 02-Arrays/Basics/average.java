package Arrays.Basics;

public class average {
    public static void main(String[] args){
        double[] arr = {15, 28, 35, 42, 50, 60};
        double sum = 0.0;
        for(int i = 0; i<arr.length; i++){
          sum = sum + arr[i];
        }
        double avg;
        avg = sum/arr.length;
        System.out.println("average is: " + avg);
    }
}
