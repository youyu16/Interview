package LeetCode;

/**
 * Created by t-tiyou on 10/25/2016.
 */
public class LeetCode167 {
    public class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int i = numbers.length - 1;
            int j = 0;
            while (j < i) {
                if (numbers[i] + numbers[j] > target) {
                    i--;
                }
                if (numbers[i] + numbers[j] < target) {
                    j++;
                }
                if (numbers[i] + numbers[j] == target) {
                    break;
                }
            }
            return new int[]{j + 1, i + 1};
        }
    }
}
