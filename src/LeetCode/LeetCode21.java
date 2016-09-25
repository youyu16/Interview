package LeetCode;

/**
 * Created by t-tiyou on 9/13/2016.
 */
public class LeetCode21 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null)
                return l2;
            if (l2 == null)
                return l1;
            ListNode resultHead = new ListNode(0);
            ListNode result = resultHead;
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    result.next = l1;
                    result = result.next;
                    l1 = l1.next;
                } else {
                    result.next = l2;
                    result = result.next;
                    l2 = l2.next;
                }
            }
            if(l1!=null){
                result.next=l1;
            }
            if(l2!=null){
                result.next=l2;
            }
            return resultHead.next;
        }
    }
}
