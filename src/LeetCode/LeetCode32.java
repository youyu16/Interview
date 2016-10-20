package LeetCode;

import java.util.Stack;

/**
 * Created by t-tiyou on 10/27/2016.
 */
public class LeetCode32 {
    public static void main(String[] args) {
        Solution.longestValidParentheses("()(()");
    }

    public static class Solution {
        public static int longestValidParentheses(String s) {
            char[] a = s.toCharArray();
            if (a.length == 0)
                return 0;
            int[] dp = new int[a.length];
            Stack stack = new Stack();
            stack.add(a[0]);
            int max = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] == ')') {
                    if (stack.size() == 0) {
                        stack.add(a[i]);
                        dp[i] = dp[i - 1];
                    } else if ((char) stack.peek() == ')') {
                        stack.pop();
                        dp[i] = 0;
                    } else {
                        stack.pop();
                        if(stack.size()==0)
                            dp[i] = dp[i - 1] + 2;
                    }
                } else {
                    stack.add(a[i]);
                    dp[i] = dp[i - 1];

                }
                if (dp[i] > max)
                    max = dp[i];
            }
            return max;
        }
    }
}
