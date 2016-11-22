package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t-tiyou on 10/27/2016.
 */
public class LeetCode22 {
    public class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            track(n, 1, 0, new String("("), res);
            return res;
        }

        private void track(int n, int open, int close, String comb, List<String> res) {
            if (open > n || close > open) return;
            if (open == n && close == n) {
                res.add(new String(comb));
                return;
            }

            track(n, open + 1, close, comb + "(", res);
            track(n, open, close + 1, comb + ")", res);
        }
    }
}
