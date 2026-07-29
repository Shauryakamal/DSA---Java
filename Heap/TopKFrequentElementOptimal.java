package Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementOptimal {
    public static int[] topKfrequentElement(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(pq.size() < k){
                pq.add(entry);
            }else{
                if(entry.getValue() > pq.peek().getValue()){
                    pq.poll();
                    pq.add(entry);
                }
            }
        }
        int[] ans = new int[k];
        for(int i = 0; i<ans.length; i++){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
     public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKfrequentElement(nums, k);

        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }
}
