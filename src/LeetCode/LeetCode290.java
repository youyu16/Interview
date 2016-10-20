package LeetCode;

import java.util.HashMap;

/**
 * Created by t-tiyou on 10/9/2016.
 */
public class LeetCode290 {
    public class Solution {
        public boolean wordPattern(String pattern, String str) {

            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<String, Integer> map2 = new HashMap<>();
            char[] s1 = pattern.toCharArray();
            String[] s2 = str.split(" ");
            if (pattern.length() != s2.length)
                return false;
            for (Integer i = 0; i < pattern.length(); i++) {
                if (map1.put(s1[i], i) != map2.put(s2[i], i))
                    return false;
            }
            return true;
        }
    }
}
