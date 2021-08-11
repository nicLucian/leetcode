package problem404;

import util.TreeNode;
import util.TreeUtil;

public class Solution {
    private int sum;

    public int sumOfLeftLeaves(TreeNode root) {
        walk(root);
        return sum;
    }

    private void walk(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        if (leftNode != null && leftNode.left == null && leftNode.right == null) {
            sum += leftNode.val;
        }
        walk(leftNode);
        walk(rightNode);
    }

    public static void main(String[] args) {
        Integer[] nums = {3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeUtil.buildTree(nums);
        Solution solution = new Solution();
        System.out.println(solution.sumOfLeftLeaves(root));
    }
}
