package BinarySearch.Medium;

public class CapacityShip {
     public static int shipWithinDays(int[] weights, int days){
        int low = 0;
        for(int weight : weights){
            low = Math.max(low, weight);
        }
        int high = 0;
        for(int weight : weights){
            high += weight;
        }
        while(low < high){
            int mid = low + (high - low)/2;
            long day = calculateDays(weights, mid);
            if(day <= days){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
     }
     public static long calculateDays(int[] weights, int capacity){
        int days  = 1;
        int currentLoad = 0;
        for(int weight : weights){
            if(currentLoad + weight > capacity){
                days++;
                currentLoad = weight;
            }else{
                currentLoad += weight;
            }
        }
        return days;
     }
     public static void main(String[] args){
        int[] ans = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int result = shipWithinDays(ans, days);
        System.out.println(result);
     }
}
