package LeetCode;

/**
 * Created by youti on 2016/9/11.
 */
public class LeetCode231 {
    public class Solution {
        public boolean isPowerOfTwo(int n) {
            if (Integer.bitCount(n) == 1 && n > 0)
                return true;
            else
                return false;
        }
    }
}
