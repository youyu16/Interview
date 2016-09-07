package LeetCode;

/**
 * Created by t-tiyou on 9/7/2016.
 */
public class LeetCode191 {
    public static void main(String[] args) {
        Solution test = new Solution();
        test.hammingWeight(Integer.parseInt("4294967295"));
    }

    //fasle
    static class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            String s = Long.toString(n, 2);
            char[] c = s.toCharArray();
            int total = 0;
            for (char a : c) {
                if (a == '1') {
                    total++;
                }
            }
            return total;
        }
    }

    //true
    static class Solution2 {
        public int hammingWeight(int n) {
            int sum = 0;
            while (n != 0) {
                sum++;
                n &= (n - 1);
            }
            return sum;
        }
    }
}
