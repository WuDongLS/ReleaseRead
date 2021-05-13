package SwordRefersOffer.To11_15;

import SwordRefersOffer.ListNode;

import java.util.Stack;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 如果该链表长度小于k，请返回空。
 */
public class To14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if (pHead == null){
            return pHead;
        }
        if (k == 0){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        int count = 0;
        while (pHead != null){
            stack.push(pHead);
            count++;
            pHead = pHead.next;
        }
        if (count < k){
            return null;
        }
        while (k > 1){
            stack.pop();
            k--;
        }
        return stack.pop();
    }
}
