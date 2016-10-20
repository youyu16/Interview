package LeetCode;

/**
 * Created by t-tiyou on 10/30/2016.
 */
public class LeetCode414 {
    public static void main(String[] args) {
        Solution.thirdMax(new int[]{1, 2, -2147483648});
    }

    public static class Solution {
        public static int thirdMax(int[] nums) {
            long max = Long.MIN_VALUE;
            long sec = Long.MIN_VALUE;
            long thi = Long.MIN_VALUE;
            for (int num : nums) {
                if (num > max) {
                    thi = sec;
                    sec = max;
                    max = num;
                } else if (num == max) {
                    continue;
                } else if (num > sec) {
                    thi = sec;
                    sec = num;
                } else if (num == sec) {
                    continue;
                } else if (num >= thi) {
                    thi = num;
                }
            }
            if (thi == Long.MIN_VALUE) {
                return (int) max;
            }
            return (int) thi;
        }
    }
}
