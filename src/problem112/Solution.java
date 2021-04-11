package problem112;

import util.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean hasLeftPathSum = hasPathSum(root.left, targetSum - root.val);
        boolean hasRightPathSum = hasPathSum(root.right, targetSum - root.val);

        return hasLeftPathSum || hasRightPathSum;
    }
}
