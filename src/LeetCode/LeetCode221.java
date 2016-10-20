package LeetCode;

/**
 * Created by t-tiyou on 10/10/2016.
 */
public class LeetCode221 {
    public static void main(String[] args) {

    }

    public class Solution {
        public int maximalSquare(char[][] matrix) {
            int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
            int[][] dp = new int[rows + 1][cols + 1];
            int result = 0;
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[i].length; j++) {
                    if (matrix[i - 1][j - 1] == '1') {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                        if (dp[i][j] > result)
                            result = dp[i][j];
                    }
                }
            }
            return result * result;
        }
    }
    //  暴力模拟没有完成
//    public static class Solution {
//        public int maximalSquare(char[][] matrix) {
//            int result = 0;
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    int root = Character.getNumericValue(matrix[i][j]);
//                    if (root == 1) {
//                        int temp = 1;
//                        while (true) {
//                            if (isTrue(temp, matrix, i, j)) {
//                                temp++;
//                            }
//                            if (j + temp - 1 >= matrix.length || i + temp - 1 >= matrix.length)
//                                break;
//                        }
//                        if (temp > result) {
//                            result = temp;
//                        }
//                    }
//                }
//            }
//            return result;
//        }
//
//        public boolean isTrue(int temp, char[][] matrix, int i, int j) {
//            for (int k = 0; k < temp; k++) {
//                for (int l = 0; l < temp; l++) {
//                    if (matrix[i + k][j + l] != '1') {
//                        return false;
//                    }
//                }
//            }
//            return true;
//        }
//    }
}
