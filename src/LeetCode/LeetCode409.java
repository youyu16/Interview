package LeetCode;

import java.util.HashMap;

/**
 * Created by t-tiyou on 10/5/2016.
 */
public class LeetCode409 {
    public class Solution {
        public int longestPalindrome(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            char[] a = s.toCharArray();
            for (char c : a) {
                if (!map.containsKey(c))
                    map.put(c, 1);
                else
                    map.put(c, map.get(c) + 1);
            }
            boolean flag = false;
            int result = 0;
            for (Integer integer : map.values()) {
                if (integer % 2 != 0) {
                    flag = true;
                }
                result += (integer / 2) * 2;
            }
            if (flag)
                return result + 1;
            else
                return result;
        }
    }
}
