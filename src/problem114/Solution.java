package problem114;

import util.TreeNode;
import util.TreeUtil;

public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null) {
            while (left.right != null) {
                left = left.right;
            }
            left.right = right;
            root.right = root.left;
            root.left = null;
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, null, 3, 4};
        TreeNode root = TreeUtil.buildTree(nums);
        Solution solution = new Solution();
        solution.flatten(root);

    }
}
