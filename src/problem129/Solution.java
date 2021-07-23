package problem129;

import util.TreeNode;
import util.TreeUtil;

public class Solution {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode node, int currentSum) {
        if (node.right == null && node.left == null) {
            return currentSum * 10 + node.val;
        }
        int sum = currentSum * 10 + node.val;
        int leftSum = node.left == null ? 0 : sum(node.left, sum);
        int rightSum = node.right == null ? 0 : sum(node.right, sum);
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2};
        TreeNode root = TreeUtil.buildTree(nums);
        Solution solution = new Solution();
        System.out.println(solution.sumNumbers(root));
    }
}
