package problem94;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private final List<Integer> mNodes = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return mNodes;
    }

    private void inorder(TreeNode treeNode) {
        if (treeNode != null) {
            inorder(treeNode.left);
            mNodes.add(treeNode.val);
            inorder(treeNode.right);
        }
    }
}
