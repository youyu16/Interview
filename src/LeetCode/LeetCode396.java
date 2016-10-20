package LeetCode;

/**
 * Created by t-tiyou on 10/30/2016.
 */
public class LeetCode396 {
    public static void main(String[] args) {
        Solution.maxRotateFunction(new int[]{4, 3, 2, 6});
    }

    public static class Solution {
        public static int maxRotateFunction(int[] A) {
            int[] F = new int[A.length];
            int count = 0;

            for (int i = 0; i < A.length; i++) {
                F[0] += i * A[i];
                count += A[i];
            }
            int max = F[0];
            for (int i = 1; i < F.length; i++) {
                F[i] = F[i - 1] + count - F.length * A[F.length - i];
                if (F[i] > max)
                    max = F[i];
            }
            return max;
        }
    }
}
