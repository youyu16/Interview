package LeetCode;

import java.util.HashSet;

/**
 * Created by t-tiyou on 10/10/2016.
 */
public class LeetCode3 {
    public static void main(String[] args) {
        Solution.lengthOfLongestSubstring("abcabcbb");
    }

    public static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            char[] chars = s.toCharArray();
            int result = 0;
            for (int i = 0; i < chars.length; i++) {
                HashSet<Character> set = new HashSet<>();
                int temp = 0;
                for (int j = i; j < chars.length; j++) {
                    if (!set.contains(chars[j])) {
                        set.add(chars[j]);
                        temp++;
                    } else {
                        break;
                    }
                }
                if (temp > result) {
                    result = temp;
                }
            }
            return result;
        }
    }
}
