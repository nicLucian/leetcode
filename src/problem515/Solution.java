package problem515;

import util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            int currentMax = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = deque.poll();
                if (currentNode.val > currentMax) {
                    currentMax = currentNode.val;
                }
                TreeNode leftNode = currentNode.left;
                TreeNode rightNode = currentNode.right;
                if (leftNode != null) {
                    deque.offer(leftNode);
                }
                if (rightNode != null) {
                    deque.offerLast(rightNode);
                }
            }
            result.add(currentMax);
        }
        return result;
    }
}
