package LeetCode;

/**
 * Created by t-tiyou on 10/21/2016.
 */
public class LeetCode11 {
    public class Solution {
        public int maxArea(int[] height) {
            int result = 0;
            int i=0;
            int j=height.length-1;
            while(i!=j){
                int temp = Math.min(height[j],height[i])*(j-i);
                if(temp>result)
                    result = temp;
                if(height[i]<=height[j])
                    i++;
                else
                    j--;
            }
            return result;
        }
    }
}
