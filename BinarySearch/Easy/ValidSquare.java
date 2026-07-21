package BinarySearch.Easy;

public class ValidSquare {
    public static boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;

        boolean isfound = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {

                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int num = 16;
        boolean isfound = isPerfectSquare(num);
        System.out.println(isfound);
    }
}
