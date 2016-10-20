package LeetCode;

/**
 * Created by t-tiyou on 10/27/2016.
 */
public class LeetCode28 {
    public class Solution {
        public int strStr(String haystack, String needle) {
            char[] a = haystack.toCharArray();
            char[] b = needle.toCharArray();
            if (b.length > a.length)
                return -1;
            if (needle == null || needle.length() == 0)
                return 0;
            for (int i = 0; i < a.length - b.length + 1; i++) {
                if (haystack.substring(i, i + b.length).equals(needle)) {
                    return i;
                }
            }
            return -1;
        }
    }
}
