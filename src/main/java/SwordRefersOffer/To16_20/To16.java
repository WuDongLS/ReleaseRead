package SwordRefersOffer.To16_20;

import SwordRefersOffer.ListNode;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */

public class To16 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode list1_next = list1.next;
        ListNode list2_next = list2.next;
        ListNode head = list1.val > list2.val ? list2 : list1;
        return null;

    }

}
