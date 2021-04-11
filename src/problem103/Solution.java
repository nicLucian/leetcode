package problem103;


import src_util.TreeNode;
import src_util.TreeUtil;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        boolean isLeft = false;
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addFirst(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            LinkedList<Integer> level = new LinkedList<>();
            for (int i = 0; i < queueSize; i++) {
                TreeNode current = queue.poll();
                if (isLeft) {
                    level.offerFirst(current.val);
                } else {
                    level.offerLast(current.val);
                }

                TreeNode left = current.left;
                if (left != null) {
                    queue.offer(left);
                }

                TreeNode right = current.right;
                if (right != null) {
                    queue.offer(right);
                }
            }
            isLeft = !isLeft;
            result.add(new ArrayList<>(level));
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Integer[] source = {3, 9, 20, null, null, 15, 7};
        TreeNode node = TreeUtil.buildTree(source);
        List<List<Integer>> result = solution.zigzagLevelOrder(node);
        System.out.println(result.toString());
    }
}
