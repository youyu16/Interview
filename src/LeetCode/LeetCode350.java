package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by youti on 2016/9/10.
 */
public class LeetCode350 {
    public class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : nums1) {
                if (!map.containsKey(i)) {
                    map.put(i, 1);
                } else {
                    map.put(i, map.get(i) + 1);
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i : nums2) {
                if (map.containsKey(i) && map.get(i) > 0) {
                    map.put(i, map.get(i) - 1);
                    temp.add(i);
                }
            }
            int[] result = new int[temp.size()];
            for (int i = 0; i < temp.size(); i++) {
                result[i] = temp.get(i);
            }
            return result;
        }
    }
}
