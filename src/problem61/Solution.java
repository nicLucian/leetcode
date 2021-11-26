package problem61;

import util.ListNode;
import util.ListUtil;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {return null;}
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        if (length == 1 || k == 0) {
            return head;
        }
        tail.next = head;
        int steps = k % length;
        ListNode current = head;
        for (int i = 0; i < steps; i++) {
            current = current.next;
        }
        ListNode next = current.next;
        current.next = null;
        return next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2};
        ListNode node = ListUtil.buildList(nums);
        solution.rotateRight(node, 1);
    }
}
