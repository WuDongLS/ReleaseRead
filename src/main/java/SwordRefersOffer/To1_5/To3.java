package SwordRefersOffer.To1_5;

import SwordRefersOffer.ListNode;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class To3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> integers = new ArrayList<>();
        ListNode cur = listNode;
//        ListNode pre = null;
//        ListNode next = listNode.next;
//        while (cur != null){
//            next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//
//        while (pre.next != null){
//            integers.add(pre.val);
//            pre = pre.next;
//        }
//

        while (cur != null) {
            integers.add(0, cur.val);
            cur = cur.next;
        }
        return integers;
    }
}
