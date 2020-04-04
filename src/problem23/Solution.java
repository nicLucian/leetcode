package problem23;

import java.util.List;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * <p>
 * Example:
 * <p>
 * Input:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 */
class Solution {
    public static void main(String[] args) {
        ListNode list1 = initList(1, 4, 5);
        ListNode list2 = initList(1, 3, 4);
        ListNode list3 = initList(2, 6);
        ListNode[] lists = {list1, list2, list3};
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeKLists(lists);
        print(mergedList);
    }

    private static void print(ListNode node) {
        while (node != null) {
            System.out.print((node.val + ", "));
            node = node.next;
        }
    }

    private static ListNode initList(int... values) {
        ListNode point = new ListNode(0);
        ListNode head = point;
        for (int value : values) {
            point.next = new ListNode(value);
            point = point.next;
        }
        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) {
            return null;
        }
        if (len == 1){
            return lists[0];
        }
        int step = 1;
        while (step < len) {
            for (int i = 0; i < len - step; i += (step * 2)) {
                lists[i] = mergeTwoLists(lists[i], lists[i + step]);
            }
            step = step * 2;
        }
        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while (first != null && second != null) {
            if (first.val <= second.val) {
                node.next = first;
                first = first.next;
            } else {
                node.next = second;
                second = second.next;
            }
            node = node.next;
        }
        node.next = first == null ? second : first;
        return dummy.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
