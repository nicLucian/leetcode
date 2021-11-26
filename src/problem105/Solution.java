package problem105;

import util.TreeNode;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length,
                inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preOrder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        int target = preOrder[preStart];
        if (preStart == preEnd - 1) {
            return new TreeNode(target);
        }

        int targetIndexInInorder = indexOf(inorder, inStart, inEnd, target);
        TreeNode currentNode = new TreeNode(target);
        int leftLength = targetIndexInInorder - inStart;
        int rightLength = inEnd - targetIndexInInorder - 1;

        currentNode.left = leftLength <= 0 ? null : buildTree(preOrder, preStart + 1, preStart + 1 + leftLength,
                inorder, inStart, targetIndexInInorder);

        currentNode.right = rightLength <= 0 ? null : buildTree(preOrder, preStart + 1 + leftLength, preStart + 1 + leftLength + rightLength,
                inorder, targetIndexInInorder + 1, inEnd);
        return currentNode;
    }

    private int indexOf(int[] nums, int start, int end, int target) {
        for (int i = start; i < end; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] preorder = {1, 2};
        int[] inorder = {1, 2};
        Solution solution = new Solution();
        solution.buildTree(preorder, inorder);
    }
}
