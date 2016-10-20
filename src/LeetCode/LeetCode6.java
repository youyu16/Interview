package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t-tiyou on 10/30/2016.
 */
public class LeetCode6 {
    public static void main(String[] args) {
        Solution.convert("ABC", 2);
    }

    public static class Solution {
        public static String convert(String s, int numRows) {
            char[] c = s.toCharArray();
            if (c.length == 0)
                return "";

            StringBuilder[] lines = new StringBuilder[numRows];
            for (int i = 0; i < lines.length; i++) {
                lines[i] = new StringBuilder();
            }
            int i = 0;
            while (i < c.length) {
                for (int j = 0; j < numRows; j++, i++) {
                    if (i > c.length - 1)
                        break;
                    lines[j].append(c[i]);
                }
                for (int j = numRows - 2; j > 0; j--, i++) {
                    if (i > c.length - 1)
                        break;
                    lines[j].append(c[i]);
                }
            }
            String result = "";
            for (StringBuilder line : lines) {
                result += line.toString();
            }
            return result;
        }
    }
}
