package Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfrequentElement {
    public static int[] topKfrequentElement(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry);
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
