package LeetCode;

/**
 * Created by t-tiyou on 9/7/2016.
 */
public class LeetCode83 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null)
                return head;
            ListNode cur = head;
            while(cur.next!=null){
                if(cur.val==cur.next.val){
                    cur.next=cur.next.next;
                }
                else{
                    cur=cur.next;
                }
            }
            return head;
        }
    }
}
