package Heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (a.getValue() != b.getValue()) {
                return a.getValue() - b.getValue();
            } else {
                return b.getKey().compareTo(a.getKey());
            }
        });
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().getKey());
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {

        TopKFrequentWords obj = new TopKFrequentWords();

        String[] words = {
                "i", "love", "leetcode", "i", "love", "coding"
        };

        int k = 2;

        List<String> result = obj.topKFrequent(words, k);

        System.out.println(result);
    }
}
