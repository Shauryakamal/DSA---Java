package Arrays.Easy;
public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest doesn't exist");
        } else {
            System.out.println("Second Largest is: " + secondlargest);
        }
    }
}
