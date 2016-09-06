package LintCode;

/**
 * Created by t-tiyou on 9/1/2016.
 */
public class LintCode13 {
    public static void main(String[] args) {
        LintCode13 test = new LintCode13();
        test.strStr("abcde", "bcd");
    }

    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     *
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        if (source == null || target == null)
            return -1;
        char[] s = source.toCharArray();
        char[] t = target.toCharArray();
        if (s.length < t.length)
            return -1;
        if (t.length == 0)
            return 0;
        for (int i = 0; i <= s.length - t.length; i++) {
            if (s[i] == t[0]) {
                int temp = i;
                boolean result = true;
                for (int j = 0; j < t.length - 1; ) {
                    if (s[++temp] != t[++j]) {
                        result = false;
                        break;
                    }
                }
                if (result)
                    return i;
            }
        }
        return -1;
    }
}
