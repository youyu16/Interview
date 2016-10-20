package LeetCode;

/**
 * Created by t-tiyou on 10/20/2016.
 */
public class LeetCode2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode re = new ListNode(-1);
            ListNode head = re;
            int temp = 0;
            int t = 0;
            while (l1 != null && l2 != null) {
                t = l1.val + l2.val + temp;
                temp = t / 10;
                if (t >= 10) {
                    t %= 10;
                }
                re.next = new ListNode(t);
                re = re.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            while (l1 != null) {
                t = l1.val + temp;
                temp = t / 10;
                if (t >= 10) {
                    t %= 10;
                }
                re.next = new ListNode(t);
                re = re.next;
                l1 = l1.next;
            }
            while (l2 != null) {
                t = l2.val + temp;
                temp = t / 10;
                if (t >= 10) {
                    t %= 10;
                }
                re.next = new ListNode(t);
                re = re.next;
                l2 = l2.next;
            }
            if (temp != 0) {
                re.next = new ListNode(temp);
            }
            return head.next;
        }
    }
}
