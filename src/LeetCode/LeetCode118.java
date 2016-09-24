package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by youti on 2016/9/22.
 */
public class LeetCode118 {
    public static void main(String[] args) {
        Solution test = new Solution();
        test.generate(4);
    }
    public static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                temp.add(0, 1);
                for (int j = 1; j < temp.size()-1; j++) {
                    temp.set(j, temp.get(j) + temp.get(j + 1));
                }
                result.add(new ArrayList<>(temp));
            }
            return result;
        }
    }
}