package LeetCode;

import Sort.MergeSort;

/**
 * Created by t-tiyou on 10/27/2016.
 */
public class LeetCode23 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0 || lists == null)
                return null;
            else
                return mergeKLists(lists, 0, lists.length - 1);
        }

        public ListNode mergeKLists(ListNode[] lists, int start, int end) {
            if (start == end)
                return lists[start];
            else if (start < end) {
                int mid = (end - start) / 2 + start;
                ListNode left = mergeKLists(lists, start, mid);
                ListNode right = mergeKLists(lists, mid + 1, end);
                return mergeTwoList(left, right);
            } else
                return null;
        }

        public ListNode mergeTwoList(ListNode l1, ListNode l2) {
            ListNode temp = new ListNode(-1);
            ListNode head = temp;
            while (l1 != null && l2 != null) {
                if (l1.val >= l2.val) {
                    temp.next = l2;
                    l2 = l2.next;
                } else {
                    temp.next = l1;
                    l1 = l1.next;
                }
                temp = temp.next;
            }
            if (l1 != null)
                temp.next = l1;
            if (l2 != null)
                temp.next = l2;
            return head.next;
        }
    }
}