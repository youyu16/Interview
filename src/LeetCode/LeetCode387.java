package LeetCode;

import java.util.HashMap;

/**
 * Created by t-tiyou on 9/10/2016.
 */
public class LeetCode387 {
    public class Solution {
        public int firstUniqChar(String s) {
            if(s.length()==0||s==null)
                return -1;
            HashMap<Character,Integer> map = new HashMap<>();
            char[] a = s.toCharArray();
            for(char c:a){
                if(!map.containsKey(c)){
                    map.put(c,1);
                }else{
                    map.put(c,map.get(c)+1);
                }
            }
            for(int i=0;i<a.length;i++){
                if(map.get(a[i])==1)
                    return i;
            }
            return -1;
        }
    }
}
