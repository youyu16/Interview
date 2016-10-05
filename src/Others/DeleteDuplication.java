package Others;

/**
 * Created by t-tiyou on 9/30/2016.
 */
public class DeleteDuplication {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(5);
        temp = temp.next;
        deleteDuplication(head);
    }

    //删除链表重复元素
    public static ListNode deleteDuplication(ListNode pHead) {
        ListNode first = new ListNode(-1);
        first.next = pHead;
        ListNode p = pHead;
        ListNode last = first;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                int val = p.val;
                while (p != null && p.val == val ) {
                    p = p.next;
                }
                last.next = p;
            } else {
                last = p;
                p = p.next;
            }
        }
        return first.next;
    }
}
