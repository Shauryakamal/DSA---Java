package Arrays.Medium;

import java.util.HashMap;

public class majorityelement {
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int freq = Integer.MIN_VALUE;
        int element = -1;
        for(int key : map.keySet()){
            freq = map.get(key);
            element = key;
              if(freq > arr.length/2){
            System.err.println(freq);
            System.err.println(element);
        }
        }
      
    }
}
