package LeetCode;

/**
 * Created by t-tiyou on 9/7/2016.
 */
public class LeetCode326 {

    public class Solution {
        public boolean isPowerOfThree(int n) {
            if (n < 1) {
                return false;
            }

            while (n % 3 == 0) {
                n /= 3;
            }

            return n == 1;
        }
    }
}
