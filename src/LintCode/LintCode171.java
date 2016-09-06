package LintCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by t-tiyou on 9/1/2016.
 */
public class LintCode171 {
    public static void main(String[] args) {
        LintCode171 test = new LintCode171();
        String[] t = {"tea", "and", "ate", "eat", "den"};
        test.anagrams(t);
    }

    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> result = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String str : strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String temp = String.valueOf(s);
            if (map.containsKey(temp))
                map.put(temp, map.get(temp) + 1);
            else
                map.put(temp, 1);
        }
        for (String str : strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String temp = String.valueOf(s);
            if (map.containsKey(temp) && map.get(temp) > 1) {

                result.add(str);
            }
        }
        return result;
    }
}
