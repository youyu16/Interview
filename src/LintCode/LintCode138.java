package LintCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by youti on 2016/9/3.
 */
public class LintCode138 {
    public static void main(String[] args) {
        LintCode138 test = new LintCode138();
        int[] nums = {1, -1};
        test.subarraySum(nums);
    }

    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number
     * and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        int total = 0;
        HashMap<Integer, Integer> temp = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        temp.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            total += num;
            if (temp.containsKey(total)) {
                result.add(temp.get(total) + 1);
                result.add(i);
                break;
            } else {
                temp.put(total, i);
            }
        }
        return result;
    }
}
