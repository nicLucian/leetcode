package problem199;

import util.TreeNode;
import util.TreeUtil;

import java.util.*;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        List<Integer> result = new ArrayList<>();
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = deque.poll();
                if (currentNode.left != null) {
                    deque.addLast(currentNode.left);
                }
                if (currentNode.right != null) {
                    deque.addLast(currentNode.right);
                }
                if (i == size - 1) {
                    result.add(currentNode.val);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, null, 5, null, 4};
        TreeNode root = TreeUtil.buildTree(nums);
        Solution solution = new Solution();
        solution.rightSideView(root);
    }
}
