// Group Anagrams
// Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
// An anagram is a string that contains the exact same characters as another string,
// but the order of the characters can be different.

// EXAMPLE:
// Input: strs = ["act","pots","tops","cat","stop","hat"]
// Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        GroupAnagrams ga = new GroupAnagrams();
        List<List<String>> result = ga.smethod(strs);
        System.out.println(result);
    }
   
   
    public List<List<String>> smethod(String[] strs) {
        HashMap<String, List<String>> str = new HashMap<>();
        for (String a : strs) {
            char[] b = a.toCharArray();
            Arrays.sort(b);
            String sortedarray = new String(b);
            str.putIfAbsent(sortedarray, new ArrayList<>());
            str.get(sortedarray).add(a);
        }

        return new ArrayList<>(str.values());
    }    
}
