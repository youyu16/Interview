package LeetCode;

import java.util.HashMap;

/**
 * Created by t-tiyou on 9/9/2016.
 */
public class LeetCode219 {
    public class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i],i);
                }else{
                    if(i-map.get(nums[i])<=k)
                        return true;
                    else
                        map.put(nums[i],i);
                }
            }
            return false;
        }
    }
}
