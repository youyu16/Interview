package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t-tiyou on 9/21/2016.
 */
public class LeetCode401 {
    public class Solution {
        public List<String> readBinaryWatch(int num) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 60; j++) {
                    if (Integer.bitCount(i) + Integer.bitCount(j) == num) {
                        result.add(String.format("%d:%02d", i, j));
                    }
                }
            }
            return result;
        }
    }
}
