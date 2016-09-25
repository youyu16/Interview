package LeetCode;

/**
 * Created by t-tiyou on 9/14/2016.
 */
public class LeetCode342 {
    public static void main(String[] args) {
        Solution test = new Solution();
        test.isPowerOfFour(1162261466);
        System.out.println("f");
    }
    static class Solution {
        public boolean isPowerOfFour(int num) {
            // long is important
            long temp = 1;
            while (temp < num) {
                temp = temp << 2;
            }
            if (temp == num) {
                return true;
            } else {
                return false;
            }
        }
    }
}
