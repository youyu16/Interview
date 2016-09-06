package LintCode;

import java.util.Arrays;

/**
 * Created by t-tiyou on 9/1/2016.
 */
public class LintCode158 {
    public static void main(String[] args) {

    }
    public boolean anagram(String s, String t) {
        // write your code here
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        if(s1.length!=s2.length)
            return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
}
