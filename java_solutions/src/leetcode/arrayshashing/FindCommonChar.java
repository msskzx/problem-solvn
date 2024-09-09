package leetcode.arrayshashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/find-common-characters/

class FindCommonChar {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer>[] freq = new HashMap[words.length];
        for (int i = 0; i < words.length; i++) {
            freq[i] = new HashMap<>();  
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                freq[i].put(c, freq[i].getOrDefault(c, 0) + 1);  
            }
        }
        HashMap<Character, Integer> res = new HashMap<>();
        for (char c : freq[0].keySet()) {
            res.put(c, freq[0].get(c));
        }
        
        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> cur = freq[i];
            for (char c : res.keySet()) {
                res.put(c, Math.min(res.getOrDefault(c, 0), cur.getOrDefault(c, 0)));
            }
        }
        List<String> out = new LinkedList<>();
        for (Map.Entry<Character, Integer> entry : res.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                out.add(String.valueOf(c));  
            }
        }
        
        return out;
    }
}
