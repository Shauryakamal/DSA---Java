package Arrays.Medium;

import java.util.HashMap;

public class minimunfreq {
    public static void main(String[] args){
        int[] arr = {1,1,3,1,2,1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int minimunfreq = Integer.MAX_VALUE;
        int element = -1;
        for(int key : map.keySet()){
            if(map.get(key) < minimunfreq){
                minimunfreq = map.get(key);
                element = key;
            }
        }
        System.err.println(minimunfreq);
        System.err.println(element);
    }
}
