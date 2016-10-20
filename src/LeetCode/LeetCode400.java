package LeetCode;

/**
 * Created by t-tiyou on 10/9/2016.
 */
public class LeetCode400 {
    public static void main(String[] args) {
        Solution.findNthDigit(1000000000);
    }

    public static class Solution {
        public static int findNthDigit(int n) {
            long len = 0;
            long i = 1;
            long temp = 0;
            while (true) {
                temp = len;
                len += 9 * (long) Math.pow(10, i - 1) * i;
                if (len == n)
                    return 9;
                if (len > n)
                    break;
                i++;
            }

            long cur = -1;
            if ((n - temp) % i == 0) {
                cur = (long) Math.pow(10, i - 1) - 1 + (n - temp) / i;
                String s = cur + "";
                return Character.getNumericValue(s.charAt((int) i - 1));
            } else {
                cur = (long) Math.pow(10, i - 1) + (n - temp) / i;
                String s = cur + "";
                return Character.getNumericValue(s.charAt((int) ((n - temp) % i - 1)));
            }
        }
    }
}
