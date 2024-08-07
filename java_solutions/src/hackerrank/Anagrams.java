package hackerrank;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }
        int[] aCount = new int[26];
        int[] bCount = new int[26];
        for (char c : a.toCharArray()) {
            aCount[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            bCount[c - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (aCount[i] != bCount[i]) {
                return false;
            }
        }

        return true;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
