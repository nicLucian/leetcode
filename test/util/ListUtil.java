package util;

public class ListUtil {
    private ListUtil() {

    }

    public static ListNode buildList(int[] source) {
        ListNode head = new ListNode();
        ListNode current = head;
        for (int i : source) {
            ListNode node = new ListNode(i);
            current.next = node;
            current = node;
        }
        return head.next;
    }

    public static void walk(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        walk(buildList(list));
    }
}
