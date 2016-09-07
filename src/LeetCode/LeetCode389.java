package LeetCode;

import java.util.HashMap;

/**
 * Created by t-tiyou on 9/6/2016.
 */
public class LeetCode389 {

    public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : a) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        for (char c : b) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return c;
            }
        }
        return ' ';
    }
}
