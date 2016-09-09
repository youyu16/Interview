package LeetCode;

import java.util.HashMap;

/**
 * Created by t-tiyou on 9/8/2016.
 */
public class LeetCode383 {

    public class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            char[] a = ransomNote.toCharArray();
            char[] b = magazine.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : b) {
                if (!map.containsKey(c))
                    map.put(c, 1);
                else
                    map.put(c, map.get(c) + 1);
            }
            for (char c : a) {
                if (map.containsKey(c)) {
                    if (map.get(c) == 0)
                        return false;
                    else
                        map.put(c, map.get(c) - 1);
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
