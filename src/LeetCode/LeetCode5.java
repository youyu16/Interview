package LeetCode;

/**
 * Created by t-tiyou on 10/10/2016.
 */
public class LeetCode5 {
    public static void main(String[] args) {
        Solution.longestPalindrome("bb");
    }

    public static class Solution {
        public static String longestPalindrome(String s) {
            char[] a = s.toCharArray();
            int len = a.length;
            if (len <= 1)
                return s;
            int max = 0;
            int left = 0;
            for (int i = 1; i < len; i++) {
                int low = i - 1;
                int high = i;
                //偶数最长回文
                while (low >= 0 && high < len && a[low] == a[high]) {
                    low--;
                    high++;
                }
                if (high - 1 - low > max) {
                    max = high - 1 - low;
                    left = low + 1;
                }
                //奇数最长回文
                low = i - 1;
                high = i + 1;
                while (low >= 0 && high < len && a[low] == a[high]) {
                    low--;
                    high++;
                }
                if (high - 1 - low > max) {
                    max = high - 1 - low;
                    left = low + 1;
                }
            }
            if (max == 1) {
                return s.substring(0, 1);
            }
            return s.substring(left, left + max);
        }
    }
}
