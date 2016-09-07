package LeetCode;

/**
 * Created by t-tiyou on 9/6/2016.
 */
public class LeetCode258 {
    public static void main(String[] args) {
        LeetCode258 test = new LeetCode258();
        test.addDigits(10);
    }

    public int addDigits(int num) {
        int sum = num;
        while (sum >= 10) {
            int temp = sum;
            sum = 0;
            while (temp % 10 != 0 || temp / 10 > 0) {
                int digit = temp % 10;
                temp /= 10;
                sum += digit;
            }
        }
        return sum;
    }
}
