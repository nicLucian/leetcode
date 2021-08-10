package problem543;

import util.TreeNode;

public class Solution {
    private int mMaxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return mMaxDiameter;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDiameter = depth(node.left);
        int rightDiameter = depth(node.right);
        int sum = leftDiameter + rightDiameter;
        if (sum > mMaxDiameter) {
            mMaxDiameter = sum;
        }
        return Math.max(leftDiameter, rightDiameter) + 1;
    }
}
