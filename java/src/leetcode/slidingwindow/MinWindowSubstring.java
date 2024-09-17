package leetcode.slidingwindow;

import java.util.HashMap;

// https://leetcode.com/problems/minimum-window-substring/

class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }
        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int need = countT.size();
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int lf = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
                have++;
            }

            while (have == need) {
                if (r - lf + 1 < resLen) {
                    res[0] = lf;
                    res[1] = r;
                    resLen = r - lf + 1;
                }
                char lfc = s.charAt(lf);
                window.put(lfc , window.get(lfc) - 1);
                if (countT.containsKey(lfc) && window.get(lfc) < countT.get(lfc)) {
                    have--;
                }
                lf++;
            }
        }
        return resLen != Integer.MAX_VALUE? s.substring(res[0], res[1] + 1)  : "";
    }
}