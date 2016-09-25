package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by t-tiyou on 9/10/2016.
 */
public class LeetCode169 {

    public class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > nums.length / 2){
                    return entry.getKey();
                }
            }
            return -1;
        }
    }
}
