package BinarySearch.Easy;

public class Sqrt {
    public static int mysqrt(int x){
        int low = 0;
        int high = x;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid * mid == x){
                return mid;
            }else if( mid * mid < x){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int x = 8;
        int ans = mysqrt(x);
        System.out.println(ans);
    }
}
