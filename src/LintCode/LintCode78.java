package LintCode;

/**
 * Created by t-tiyou on 9/2/2016.
 */
public class LintCode78 {
    public static void main(String[] args) {
        String[] a = {"A", "A", "A"};
        LintCode78 test = new LintCode78();
        test.longestCommonPrefix(a);
    }

    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        int n = Integer.MAX_VALUE;
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        String first = strs[0];
        if (first == null)
            return null;
        if (first == "")
            return "";
        char[] list = first.toCharArray();
        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            if (str == null)
                return null;
            if (str == "")
                return "";
            char[] temp = str.toCharArray();
            int shortLen = temp.length < list.length ? temp.length : list.length;
            for (int j = 0; j < shortLen; j++) {
                if (list[j] != temp[j]) {
                    if (j < n) {
                        n = j;
                        break;
                    }
                }
                if(j==shortLen-1){
                    if (j < n) {
                        n = shortLen;
                    }
                }
            }
        }
        String result = first.substring(0, n);
        return result;
    }
}
