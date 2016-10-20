package LeetCode;

import java.util.Stack;

/**
 * Created by t-tiyou on 10/9/2016.
 */
public class LeetCode20 {
    public class Solution {
        public boolean isValid(String s) {
            if (s.length() % 2 != 0)
                return false;
            Stack<Character> stack = new Stack<>();
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                char temp = c[i];
                if (temp == '(' || temp == '[' || temp == '{') {
                    stack.push(c[i]);
                } else {
                    if (stack.isEmpty())
                        return false;
                    char peek = stack.peek();
                    if (temp == ')' && peek != '(')
                        return false;
                    if (temp == '}' && peek != '{')
                        return false;
                    if (temp == ']' && peek != '[')
                        return false;
                    stack.pop();
                }
            }
            if (stack.isEmpty())
                return true;
            else
                return false;
        }
    }
}
