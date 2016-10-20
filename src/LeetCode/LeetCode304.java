package LeetCode;

/**
 * Created by t-tiyou on 10/25/2016.
 */
//sumRegion(2,1,4,3),sumRegion(1,1,2,2),sumRegion(1,2,2,4)
public class LeetCode304 {

    public static void main(String[] args) {
        int[][] m = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        NumMatrix test = new NumMatrix(m);
        test.sumRegion(2, 1, 4, 3);
        test.sumRegion(1, 1, 2, 2);
        test.sumRegion(1, 2, 2, 4);
    }
}

class NumMatrix {
    int[][] temp;

    public NumMatrix(int[][] matrix) {
        if (matrix.length != 0 && matrix[0].length != 0) {
            temp = new int[matrix.length + 1][matrix[0].length + 1];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    temp[i + 1][j + 1] = matrix[i][j];
                }
            }
            for (int i = 1; i < temp.length; i++) {
                for (int j = 1; j < temp[0].length; j++) {
                    temp[i][j] += temp[i - 1][j] + temp[i][j - 1] - temp[i - 1][j - 1];
                }
            }
            // print matrix;
            for (int i = 1; i < temp.length; i++) {
                for (int j = 1; j < temp[0].length; j++) {
                    System.out.print(temp[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int a = temp[row2 + 1][col2 + 1];
        int b = temp[row1][col2 + 1];
        int c = temp[row2 + 1][col1];
        int d = temp[row1][col1];
        int result = a - b - c + d;
        return result;
    }

    // Your NumMatrix object will be instantiated and called as such:
    // NumMatrix numMatrix = new NumMatrix(matrix);
    // numMatrix.sumRegion(0, 1, 2, 3);
    // numMatrix.sumRegion(1, 2, 3, 4);
}