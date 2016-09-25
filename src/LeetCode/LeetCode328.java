package LeetCode;

/**
 * Created by t-tiyou on 9/11/2016.
 */
public class LeetCode328 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode odd = head.next;
            ListNode oddHead = odd;
            ListNode even = head;
            while (even.next != null || odd.next != null) {
                if (even.next != null) {
                    even.next = even.next.next;
                    if (even.next != null)
                        even = even.next;
                }
                if (odd.next != null) {
                    odd.next = odd.next.next;
                    if (odd.next != null)
                        odd = odd.next;
                }
            }
            even.next = oddHead;
            return head;
        }
    }
}
