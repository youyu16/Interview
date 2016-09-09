package LeetCode;

import java.util.HashMap;

/**
 * Created by t-tiyou on 9/8/2016.
 */
public class LeetCode349 {

    public class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : nums1) {
                if (!map.containsKey(i))
                    map.put(i, 1);
            }
            int j = 0;
            for (int i : nums2) {
                if (map.containsKey(i) && map.get(i) > 0) {
                    j++;
                    map.put(i, 0);
                }
            }
            int[] result = new int[j];
            int k=0;
            for (Integer integer : map.keySet()) {
                if(map.get(integer)==0){
                   result[k++]=integer;
                }
            }
            return result;
        }
    }
}
