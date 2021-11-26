package problem513;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import util.TreeNode;

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }

        LinkedList<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        int result = root.val;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = deque.poll();
                if (i == 0) {
                    result  = current.val;
                }
                TreeNode leftNode = current.left;
                TreeNode rightNode = current.right;
                if (leftNode != null) {
                    deque.addLast(leftNode);
                }
                if (rightNode != null) {
                    deque.addLast(rightNode);
                }
            }
        }
        return result;
    }
}