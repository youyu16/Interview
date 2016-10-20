package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by t-tiyou on 2016/11/22.
 */
public class LeetCode39 {
    public static void main(String[] args) {
        combinationSum(new int[]{2, 3, 6, 7}, 7);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); // sort candidates to try them in asc order
        List<List<List<Integer>>> dp = new ArrayList<>();
        for (int i = 1; i <= target; i++) { // run through all targets from 1 to target
            List<List<Integer>> newList = new ArrayList(); // combs for curr i
            // run through all candidates <= i
            for (int j = 0; j < candidates.length && candidates[j] <= i; j++) {
                // special case when curr target is equal to curr candidate
                if (i == candidates[j])
                    newList.add(Arrays.asList(candidates[j]));
                    // if current candidate is less than the target use prev results
                else for (List<Integer> l : dp.get(i - candidates[j] - 1)) {
                    if (candidates[j] <= l.get(0)) {
                        List cl = new ArrayList<>();
                        cl.add(candidates[j]);
                        cl.addAll(l);
                        newList.add(cl);
                    }
                }
            }
            dp.add(newList);
        }
        return dp.get(target - 1);
    }

}
