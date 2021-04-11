package problem107;

import src_util.TreeNode;

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Deque<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return new ArrayList<>(result);
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);

                TreeNode left = current.left;
                if (left != null) {
                    queue.offer(left);
                }

                TreeNode right = current.right;
                if (right != null) {
                    queue.offer(right);
                }
            }
            result.offerFirst(level);
        }

        return new ArrayList<>(result);
    }
}
