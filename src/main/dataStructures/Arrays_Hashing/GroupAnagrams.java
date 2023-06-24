package Arrays_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Given an array of strings strs, group the anagrams together.
// You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the
// letters of a different word or phrase, typically using all
// the original letters exactly once.

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] hash = new int[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
