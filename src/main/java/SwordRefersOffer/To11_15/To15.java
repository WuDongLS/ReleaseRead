package SwordRefersOffer.To11_15;

import SwordRefersOffer.ListNode;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class To15 {
    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode pre = null,next = head.next,cur = head;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
