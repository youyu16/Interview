package LeetCode;

import java.util.HashSet;

/**
 * Created by t-tiyou on 9/11/2016.
 */
public class LeetCode202 {
    public class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<>();
            while (set.add(n)) {
                int temp = 0;
                while (n != 0) {
                    temp += (n % 10) * (n % 10);
                    n = n / 10;
                }
                if (temp == 1)
                    return true;
                else
                    n = temp;
            }
            return false;
        }
    }
}
