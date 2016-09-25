package LeetCode;

/**
 * Created by t-tiyou on 9/13/2016.
 */
public class LeetCode24 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode d = new ListNode(0);
            d.next = head;
            ListNode current = d;
            while (current.next != null && current.next.next != null) {
                ListNode pre = current.next;
                ListNode last = current.next.next;
                pre.next = pre.next.next;
                current.next=last;
                last.next = pre;
                current = current.next.next;
            }
            return d.next;
        }
    }
}
