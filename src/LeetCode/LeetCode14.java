package LeetCode;

/**
 * Created by t-tiyou on 9/9/2016.
 */
public class LeetCode14 {
    public class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            char[] a = strs[0].toCharArray();
            int result = a.length;
            for (int i = 1; i < strs.length; i++) {
                char[] temp = strs[i].toCharArray();
                if (temp.length == 0) {
                    return "";
                }
                int j = 0;
                while (j < a.length && j < temp.length) {
                    if (a[j] == temp[j]) {
                        j++;
                    } else {
                        break;
                    }
                }
                if (j < result) {
                    result = j;
                }
            }
            return String.valueOf(a, 0, result);
        }

    }
}
