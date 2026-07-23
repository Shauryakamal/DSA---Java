package BinarySearch.Medium;

public class MinimumEating {
     public static int minEatingSpeed(int[] piles, int h){
        int low = 1;
        int high = 0;
        for(int pile : piles){
            high = Math.max(high, pile);
        }
        while(low < high){
            int mid = low + (high - low)/2;
            long hours = calculateHours(piles, mid);
            if(hours <= h){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
     }
     private static long calculateHours(int[] piles, int speed){
           long totalHours = 0;
           for(int pile : piles){
            totalHours += (long) Math.ceil((double) pile / speed);
           }
           return totalHours;
     }
     public static void main(String[] args){
        int[] ans = {3,6,7,11};
        int hours = 8;
        int result = minEatingSpeed(ans,hours);
        System.out.println(result);

     }
}
