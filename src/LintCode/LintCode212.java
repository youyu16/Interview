package LintCode;

/**
 * Created by t-tiyou on 9/2/2016.
 */
public class LintCode212 {
    public static void main(String[] args) {
        LintCode212 solution = new LintCode212();
        solution.replaceBlank("hello world".toCharArray(), 11);
    }

    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     * 这个题在线oj会把char数组的大小给够，必须在原来的数组上修改
     */
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        int result = length;
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ')
                result += 2;
        }
        int index = result;
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                string[--index] = '0';
                string[--index] = '2';
                string[--index] = '%';
            } else {
                string[--index] = string[i];
            }
        }

        return result;
    }
}
