package LeetCode;

/**
 * Created by t-tiyou on 10/6/2016.
 */
public class LeetCode9 {
    public class Solution {
        public boolean isPalindrome(int x) {
            int a = x;
            int b = 0;
            while (a > 0) {
                b = b * 10 + a % 10;
                a /= 10;
            }
            if(b==x)
                return true;
            return false;
        }
    }
}
