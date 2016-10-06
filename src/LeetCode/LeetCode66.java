package LeetCode;

/**
 * Created by t-tiyou on 10/6/2016.
 */
public class LeetCode66 {
    public class Solution {
        public int[] plusOne(int[] digits) {
            int temp = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i] += temp;
                temp = digits[i] / 10;
                digits[i] = digits[i] % 10;
            }
            if(temp!=0){
                int[] result = new int[digits.length+1];
                result[0]=temp;
                int j =1;
                for (int i : digits) {
                    result[j++] = i;
                }
                return result;
            }
            else{
                return digits;
            }
        }
    }
}
