package LeetCode;

/**
 * Created by t-tiyou on 9/8/2016.
 */
public class LeetCode27 {
    public class Solution {
        public int removeElement(int[] nums, int val) {
            int len = nums.length;
            for (int i = 0; i<len; ) {
                if(nums[i]==val){
                    for (int j = i+1; j < nums.length; j++) {
                        nums[j-1]=nums[j];
                    }
                    len--;
                }
                else{
                    i++;
                }
            }
            return len;
        }
    }
    //best
    class Solution2{
        public int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    }
}
