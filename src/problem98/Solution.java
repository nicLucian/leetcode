package problem98;

import util.TreeNode;

public class Solution {

    private TreeNode mPre;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode left = root.left;
        boolean isLefValid = isValidBST(left);
        if (!isLefValid) {
            return false;
        }

        int currentValue = root.val;
        if (mPre != null && currentValue <= mPre.val) {
            return false;
        }
        mPre = root;

        TreeNode right = root.right;
        return isValidBST(right);
    }
}
