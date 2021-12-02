package problem203;

import util.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = dummy.next;
        ListNode pre = dummy;
        ListNode next = current.next;
        while (current != null) {
            if (current.val == val) {
                pre.next = next;
                current.next = null;
                current = next;
            } else {
                current = next;
                pre = pre.next;
            }
            if (next != null) {
                next = next.next;
            }
        }
        return dummy.next;
    }
}
