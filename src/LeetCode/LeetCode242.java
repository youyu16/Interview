package LeetCode;

import java.util.HashMap;

/**
 * Created by t-tiyou on 9/7/2016.
 */
public class LeetCode242 {
    public class Solution {
        public boolean isAnagram(String s, String t) {
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            if(a.length!=b.length)
                return false;
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : a) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            for (char c : b) {
                if (!map.containsKey(c) || map.get(c) <= 0)
                    return false;
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) - 1);
                }
            }
            return true;
        }
    }
}
