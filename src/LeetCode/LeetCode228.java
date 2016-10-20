package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t-tiyou on 10/20/2016.
 */
public class LeetCode228 {

    public static void main(String[] args) {
        summaryRanges(new int[]{0,1,2,4,5,7});
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length==0)
            return result;
        int temp = nums[0]-1;
        int fir = nums[0];
        for (int num : nums) {
            if (num != temp + 1) {
                if (temp - fir != 0) {
                    result.add(fir + "->" + temp);
                    temp = num;
                } else {
                    result.add(fir + "");
                    temp = num;
                }
                fir = num;
            }else{
                temp++;
            }
        }
        if (temp - fir != 0) {
            result.add(fir + "->" + temp);
        } else {
            result.add(fir + "");
        }
        return result;
    }
}
