package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by t-tiyou on 10/9/2016.
 */
public class LeetCode205 {
    public class Solution {
        public boolean isIsomorphic(String s, String t) {
            Map<Character,Integer> map1 = new HashMap<>();
            Map<Character,Integer> map2 = new HashMap<>();
            //必须使用Integer，autobox造成的错误
            for (Integer i = 0; i < s.length(); i++) {
                if(map1.put(s.charAt(i),i)!=map2.put(t.charAt(i),i))
                    return false;
            }
            return true;
        }
    }
}
