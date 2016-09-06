package LintCode;

/**
 * Created by t-tiyou on 9/1/2016.
 */
public class LintCode55 {
    public static void main(String[] args) {

    }

    public boolean compareStrings(String A, String B) {
        // write your code here
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        if (a.length < b.length)
            return false;
        int[] map = new int[26];
        for (char i : a) {
            int temp = i - 'A';
            map[temp]++;
        }
        for (char i : b) {
            int temp = i - 'A';
            if (--map[temp] < 0) {
                return false;
            }
        }
        return true;
    }
}
