package LeetCode;

/**
 * Created by t-tiyou on 10/26/2016.
 */
public class LeetCode419 {
    public class Solution {
        public int countBattleships(char[][] board) {
            if (board.length == 0)
                return 0;
            int count = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == '.')
                        continue;
                    if (i > 0 && board[i - 1][j] == 'X')
                        continue;
                    if (j > 0 && board[i][j - 1] == 'X')
                        continue;
                    count++;
                }
            }
            return count;
        }
    }
}
