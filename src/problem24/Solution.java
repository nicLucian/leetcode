package problem24;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node = solution.init();
        ListNode swappedNode = solution.swapPairs(node);
        solution.print(swappedNode);

    }

    private ListNode init(int... args) {
        if (args == null || args.length == 0) {
            return null;
        }
        ListNode head = new ListNode(args[0]);
        ListNode node = head;
        for (int i = 1; i < args.length; i++) {
            ListNode newNode = new ListNode(args[i]);
            node.next = newNode;
            node = newNode;
        }
        return head;
    }

    private void print(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println();
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;
        ListNode p1 = head;
        ListNode p2 = head.next;
        if (p2 == null) {
            return head;
        }
        while (p1 != null && p2 != null) {
            tmp.next = p2;
            p1.next = p2.next;
            p2.next = p1;
            tmp = tmp.next.next;
            p1 = p1.next;
            if (p1 != null) {
                p2 = p1.next;
            }
        }
        return dummy.next;
    }

    private  static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
