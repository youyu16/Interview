package LeetCode;

/**
 * Created by t-tiyou on 10/30/2016.
 */
public class LeetCode413 {
    public class Solution {
        public int numberOfArithmeticSlices(int[] A) {
            if (A.length < 3) {
                return 0;
            }
            int max = 0;
            int cnt = 1;
            int diff = A[1] - A[0];
            for (int i = 2; i < A.length; i++) {
                if (A[i] - A[i - 1] == diff) {
                    max += cnt;
                    cnt++;
                } else {
                    diff = A[i] - A[i - 1];
                    cnt = 1;
                }

            }
            return max;
        }
    }
}
