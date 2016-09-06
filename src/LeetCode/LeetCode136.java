package LeetCode;


/**
 * Created by t-tiyou on 9/5/2016.
 */
public class LeetCode136 {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;

        }
        return result;
    }
}
