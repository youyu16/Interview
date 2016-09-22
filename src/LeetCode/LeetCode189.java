package LeetCode;

import java.util.ArrayList;

/**
 * Created by youti on 2016/9/11.
 */
public class LeetCode189 {
    public class Solution {
        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            ArrayList<Integer> temp = new ArrayList<>();
            int len = nums.length - 1;
            while (k-- > 0) {
                temp.add(nums[len--]);
            }
            for (int i = len + 1; i > 0; i--) {
                nums[i + temp.size() - 1] = nums[i - 1];
            }
            int n = temp.size();
            for (int i = 0; i < temp.size(); i++) {
                nums[i] = temp.get(--n);
            }
        }
    }
}
