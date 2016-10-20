package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by t-tiyou on 10/30/2016.
 */
public class LeetCode415 {
    public static void main(String[] args) {
        Solution.addStrings("99", "9");
    }

    public static class Solution {
        public static String addStrings(String num1, String num2) {
            StringBuilder sb = new StringBuilder();
            int len1 = num1.length() - 1, len2 = num2.length() - 1, carry = 0, sum = 0;
            while (len1 >= 0) {
                if (len2 >= 0) {
                    sum = num2.charAt(len2) - '0' + num1.charAt(len1) - '0' + carry;
                } else {
                    sum = num1.charAt(len1) - '0' + carry;
                }
                if (sum < 10) {
                    sb.append(sum);
                    carry = 0;
                } else {
                    carry = sum / 10;
                    int tmp = sum % 10;
                    sb.append(tmp);
                }
                len2--;
                len1--;
            }

            if (carry > 0)
                sb.append(carry);

            return sb.reverse().toString();
        }
    }
}
