package problem109;

import util.ListNode;
import util.ListUtil;
import util.TreeNode;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        return sortedListToBST(head, null);
    }

    private TreeNode sortedListToBST(ListNode start, ListNode end) {
        ListNode mid = findMid(start, end);
        TreeNode root = new TreeNode(mid.val);
        if (start == mid || end == mid) {
            return root;
        }
        root.left = sortedListToBST(start, mid);
        if (mid.next != end) {
            root.right = sortedListToBST(mid.next, end);
        }
        return root;
    }

    private ListNode findMid(ListNode start, ListNode end) {
        ListNode slow = start;
        ListNode fast = start;
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        ListNode head = ListUtil.buildList(nums);
        Solution solution = new Solution();
        solution.sortedListToBST(head);
    }
}
