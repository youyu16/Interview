package LeetCode;

import java.util.HashMap;

/**
 * Created by t-tiyou on 9/7/2016.
 */
public class LeetCode217 {

    public class Solution {
        public boolean containsDuplicate(int[] nums) {
            if(nums.length==1)
                return false;
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int num : nums) {
                if(!map.containsKey(num))
                    map.put(num,1);
                else
                    return true;
            }
            return false;
        }
    }
}
