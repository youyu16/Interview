package LeetCode;

import java.util.HashSet;

/**
 * Created by t-tiyou on 9/9/2016.
 */
public class LeetCode160 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA==null||headB==null){
                return null;
            }
            HashSet<ListNode> set = new HashSet<>();
            ListNode a = headA;
            ListNode b = headB;
            while(a!=null){
                set.add(a);
                a=a.next;
            }
            while (b!=null){
                if(set.contains(b))
                    return b;
                b=b.next;
            }
            return null;
        }
    }
}
