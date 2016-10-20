package LeetCode;

/**
 * Created by t-tiyou on 10/9/2016.
 */
public class LeetCode88 {
    public class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = m + n - 1; i >= 0; i--) {
                if (n < 1) {
                    nums1[i] = nums1[m - 1];
                    m--;
                    continue;
                }
                if (m < 1) {
                    nums1[i] = nums2[n - 1];
                    n--;
                    continue;
                }
                if (nums1[m - 1] <= nums2[n - 1]) {
                    nums1[i] = nums2[n - 1];
                    n--;
                } else {
                    nums1[i] = nums1[m - 1];
                    m--;
                }

            }
        }
    }
}
