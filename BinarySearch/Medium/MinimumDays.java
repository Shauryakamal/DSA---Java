package BinarySearch.Medium;

public class MinimumDays {
        public static int minDays(int[] bloomDay, int m, int k) {
           
            if((long)m * k > bloomDay.length){
                return -1;
            }
            int low = Integer.MAX_VALUE;
            int high = Integer.MIN_VALUE;
            int ans = -1;
            for(int bloom : bloomDay){
                low = Math.min(low, bloom);
                high = Math.max(high,bloom);
            }
            while(low <= high){
                int mid = low + (high-low)/2;
                if(canMake(bloomDay,mid,m,k)){
                    ans = mid;
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            return ans;
        }
        public static boolean canMake(int[] bloomDay, int day, int m, int k){
            int count = 0;
            int bouqet = 0;
            for(int bloom : bloomDay){
                if(bloom <= day){
                    count++;
                    if(count == k){
                    bouqet++;
                    count = 0;
                }
                }else{
                    count = 0;
                }
            }
            return bouqet >= m;
        }
        public static void main(String[] args){
            int[] ans = {1,10,3,10,2};
            int mm = 3;
            int kk = 1;
            int result = minDays(ans, mm, kk);
            System.out.println(result);
        }
}
