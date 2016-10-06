package LeetCode;

import java.util.HashSet;

/**
 * Created by t-tiyou on 10/6/2016.
 */
public class LeetCode36 {
    public class Solution {
        public boolean isValidSudoku(char[][] board) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < 7; i = i + 3) {
                for (int j = 0; j < 7; j = j + 3) {
                    //查看3*3的box是否valid
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (set.contains(board[i + k][j + l]) && board[i + k][j + l] != '.')
                                return false;
                            else
                                set.add(board[i + k][j + l]);
                        }
                    }
                    set.clear();
                }
            }

            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for (int i = 0; i < board.length; i++) {
                char[] c = board[i];
                for (int j = 0; j < c.length; j++) {
                    if (row.contains(c[j]) && c[j] != '.') {
                        return false;
                    } else {
                        row.add(c[j]);
                    }
                }
                row.clear();
            }
            for (int i = 0; i < board[0].length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (col.contains(board[j][i]) && board[j][i] != '.') {
                        return false;
                    } else {
                        col.add(board[j][i]);
                    }
                }
                col.clear();
            }
            return true;
        }
    }
}