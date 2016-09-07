package LeetCode;

/**
 * Created by t-tiyou on 9/7/2016.
 */
public class LeetCode206 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            while(head!=null){
                ListNode last = head.next;
                head.next = prev;
                prev = head;
                head = last;
            }
            return prev;
        }
    }
}
