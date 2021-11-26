package problem450;

import util.TreeNode;
import util.TreeUtil;

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        int currentVal = root.val;
        if (key < currentVal) {
            root.left = deleteNode(root.left, key);
        }
        if (key > currentVal) {
            root.right = deleteNode(root.right, key);
        }
        if (key == currentVal) {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            TreeNode smallest = smallest(root.right);
            root.right = deleteNode(root.right, smallest.val);
        }
        return root;
    }

    public TreeNode smallest(TreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer[] nums = {5, 3, 6, 2, 4, null, 7};
        TreeNode root = TreeUtil.buildTree(nums);
        solution.deleteNode(root, 3);
    }
}
