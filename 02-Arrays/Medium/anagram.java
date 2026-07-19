package Arrays.Medium;

import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String a = "nagaram";
        if (s.length() != a.length()) {
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (!map.containsKey(ch)) {
                System.err.println(false);
                return;
            }
            if (map.get(ch) == 0) {
                System.err.println(false);
                return;
            }
            // freq minus hogii
            map.put(ch, map.get(ch) - 1);
        }
        System.err.println(true);
    }
}
