package LeetCode;

/**
 * Created by t-tiyou on 10/5/2016.
 */
public class LeetCode8 {

    public static void main(String[] args) {
        Solution.myAtoi("-2147483648");

    }

    public static class Solution {
        public static int myAtoi(String str) {
            char[] chars = str.trim().toCharArray();
            boolean isNeg = false;
            boolean hasSign = false;
            long result = 0;
            for (int i = 0; i < chars.length; i++) {

                char a = chars[i];
                if (i == 0 && a == '-') {
                    if (hasSign == true)
                        return 0;
                    isNeg = true;
                    hasSign = true;
                    continue;
                }
                if (i == 0 && a == '+') {
                    if (hasSign == true)
                        return 0;
                    hasSign = true;
                    continue;
                }
                if (a - '0' >= 0 && a - '0' <= 9) {
                    if (isNeg)
                        result = result * 10 - (a - '0');
                    else
                        result = result * 10 + (a - '0');
                } else {
                    break;
                }
                if (result > Integer.MAX_VALUE) {
                    result = Integer.MAX_VALUE;
                    break;
                } else if (result < Integer.MIN_VALUE) {
                    result = Integer.MIN_VALUE;
                    break;
                }
            }
            return (int) result;
        }
    }
}
