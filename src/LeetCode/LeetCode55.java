package LeetCode;

/**
 * Created by t-tiyou on 10/21/2016.
 */
public class LeetCode55 {
    public static void main(String[] args) {
        System.out.print(Solution.canJump(new int[]{2,3,1,1,4}));
    }
    public static class Solution {
        public static boolean canJump(int[] nums) {
            Boolean result = new Boolean(false);
            return isOK(nums,nums.length-1,result);
        }
        public static boolean isOK(int[] nums,int i,Boolean hasPath){
            if(i==0&&nums[i]>0||hasPath)
                return true;
            for (int j = 0; j < i; j++) {
                if(isOK(nums,j,hasPath)&&nums[j]>i-j){
                    hasPath = true;
                    return true;
                }
            }
            return false;
        }
    }
}
