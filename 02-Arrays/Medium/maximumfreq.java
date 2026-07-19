package Arrays.Medium;

import java.util.HashMap;

public class maximumfreq {
    public static void main(String[] args){
        int[] arr = {1,2,1,3,2,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int maxFreq = Integer.MIN_VALUE;
        int element = -1;
        for(int key : map.keySet()){
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                element = key;
            }
            
        }
        System.err.println(maxFreq);
        System.err.println(element);
    }
}
