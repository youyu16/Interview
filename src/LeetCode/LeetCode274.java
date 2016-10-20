package LeetCode;

/**
 * Created by t-tiyou on 10/10/2016.
 */
public class LeetCode274 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] citations = {1, 1};
        test.hIndex(citations);
    }
    // O(n2) 还不够好
    public static class Solution {
        public int hIndex(int[] citations) {
            int[] temp = new int[citations.length + 1];
            int result = 0;
            for (int i = 0; i < citations.length + 1; i++) {
                for (int j = 0; j < citations.length; j++) {
                    if (citations[j] >= i) {
                        temp[i]++;
                    }
                }
            }
            for (int i = 1; i < temp.length; i++) {

                if (temp[i] >= i  && i > result)
                    result = i;
            }
            return result;
        }
    }
}
