package problem1290;

import util.ListNode;
import util.ListUtil;

public class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        int result = 0;
        while (current != null) {
            result = (result << 1) | current.val;
            current = current.next;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1};
        ListNode head = ListUtil.buildList(nums);
        Solution solution = new Solution();
        System.out.println(solution.getDecimalValue(head));
    }
}
