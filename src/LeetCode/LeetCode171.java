package LeetCode;

/**
 * Created by t-tiyou on 9/9/2016.
 */
public class LeetCode171 {
    public static void main(String[] args) {
        Solution test = new Solution();
        test.titleToNumber("AB");
    }

    static class Solution {
        public int titleToNumber(String s) {
            char[] a = s.toCharArray();
            int result = 0;
            for (int i = 0; i < a.length; i++) {
                result = result * 26 + a[i] - 'A' + 1;
            }
            return result;
        }
    }
}
