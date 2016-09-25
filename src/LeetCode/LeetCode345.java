package LeetCode;

/**
 * Created by t-tiyou on 9/13/2016.
 */
public class LeetCode345 {
    public static void main(String[] args) {
        Solution test = new Solution();
        test.reverseVowels("hello");
    }

    static class Solution {
        public String reverseVowels(String s) {
            char[] chars = s.toCharArray();
            String temp = "aeiouAEIOU";
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                if (temp.contains(chars[left] + "")) {
                    if (temp.contains(chars[right] + "")) {
                        char t = chars[left];
                        chars[left] = chars[right];
                        chars[right] = t;
                        left++;
                        right--;
                    } else {
                        right--;
                    }
                } else {
                    left++;
                }
            }
            return String.valueOf(chars);
        }
    }
}
