package LeetCode;

/**
 * Created by t-tiyou on 9/11/2016.
 */
public class LeetCode263 {
    public class Solution {
        public boolean isUgly(int num) {
            if (num == 1)
                return true;
            if (num == 0)
                return false;
            while (num % 2 == 0) {
                num /= 2;
            }
            while (num % 3 == 0) {
                num /= 3;
            }
            while (num % 5 == 0) {
                num /= 5;
            }
            if (num == 1)
                return true;
            else
                return false;
        }
    }
}
