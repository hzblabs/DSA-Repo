// Question:
// You are given two strings s1 and s2. Return true if s2 contains a permutation of s1, or false otherwise. 
// That means if a permutation of s1 exists as a substring of s2, then return true. Both strings only contain lowercase letters.
// Example 1: Input: s1 = "abc", s2 = "lecabee" Output: true
// Explanation: The substring "cab" is a permutation of "abc" and is present in "lecabee".

import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        permutation a = new permutation();
        String s1 = "haz";
        String s2 = "biohazard";
        System.out.println("s2 contains a permutation of s1: " + a.perm(s1, s2));
        
    }

    public boolean perm(String s1, String s2) {
        char[] res = s1.toCharArray();
        Arrays.sort(res);
        String rex = new String(res);

        for (int i = 0; i < s2.length(); i++) {
            for (int j = i; j < s2.length(); j++) {
                char[] red = s2.substring(i, j + 1).toCharArray();
                Arrays.sort(red);
                String ref = new String(red);

                if (ref.equals(rex)) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
