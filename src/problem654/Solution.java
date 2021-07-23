package problem654;

import util.TreeNode;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    private TreeNode construct(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        int maxIndex = findMax(nums, start, end);
        TreeNode currentNode = new TreeNode(nums[maxIndex]);
        currentNode.left = construct(nums, start, maxIndex);
        currentNode.right = construct(nums, maxIndex + 1, end);
        return currentNode;
    }

    int findMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = start; i < end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        Solution solution = new Solution();
        solution.constructMaximumBinaryTree(nums);
    }
}
