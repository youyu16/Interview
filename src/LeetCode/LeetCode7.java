package LeetCode;

/**
 * Created by t-tiyou on 10/6/2016.
 */
public class LeetCode7 {
    public class Solution {
        public int reverse(int x) {
            String s = x + "";
            String result = "";
            char[] a = s.toCharArray();
            if (a[0] == '-') {
                result += '-';
                for (int i = a.length - 1; i > 0; i--) {
                    result += a[i];
                }
            } else {
                for (int i = a.length - 1; i >= 0; i--) {
                    result += a[i];
                }
            }
            long l = Long.parseLong(result);
            if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
                return 0;
            }
            return (int)l;
        }
    }
}
