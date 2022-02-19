package problem116;


import util.TreeNode;

public class Solution {
    public TreeNode connect(TreeNode root) {
        if (root == null || root.left == null) {
            return root;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (right != null) {
            left.next = right;
        }
        TreeNode next = left.next;
        while (next != null) {
            TreeNode target = next.left == null ? next.right : next.left;
            if (target != null) {
                if (left.right != null) {
                    left.right.next = target;
                } else if (left.left != null) {
                    left.left.next = target;
                }
                break;
            }
            next = next.next;
        }
        connect(left);
        connect(right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;

        Solution solution = new Solution();
        solution.connect(node1);

    }
}
