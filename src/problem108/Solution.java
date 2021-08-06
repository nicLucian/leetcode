package problem108;

import util.TreeNode;
import util.TreeUtil;

public class Solution {
    public TreeNode sortedArrayToBST(Integer[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(Integer[] nums, int start, int end) {
        if (start < 0 || start >= nums.length || end < 0 || end >= nums.length) {
            return null;
        }

        if (start > end) {
            return null;
        }

        if (start == end) {
            return new TreeNode(nums[start]);
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, start, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, end);
        return node;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = TreeUtil.buildTree(nums);
        solution.sortedArrayToBST(nums);
    }
}
