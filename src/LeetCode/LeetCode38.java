package LeetCode;

/**
 * Created by t-tiyou on 10/9/2016.
 */
public class LeetCode38 {
    public static void main(String[] args) {
        Solution.countAndSay(4);
    }

    public static class Solution {
        public static String countAndSay(int n) {
            String temp = "1";
            while (n-- != 1) {
                StringBuilder sb = new StringBuilder();
                char[] chars = temp.toCharArray();
                int count = 0;
                for (int i = 0; i < chars.length; i++) {
                    count++;

                    if (i != chars.length - 1 && chars[i] == chars[i + 1]) {
                        continue;
                    } else {
                        sb.append(count).append(chars[i]);
                        count = 0;
                    }

                }
                temp = sb.toString();
            }
            return temp;
        }
    }
}
