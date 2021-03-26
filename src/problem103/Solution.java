package problem103;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        boolean isLeft = false;
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addFirst(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            LinkedList<Integer> level = new LinkedList<>();
            for (int i = 0; i < queueSize; i++) {
                if (isLeft) {


                } else {
                    TreeNode last = queue.pollFirst();
                    TreeNode left = last.left;
                    TreeNode right = last.right;
//                    level.add
                }
                isLeft = !isLeft;
            }
        }
        return null;
    }
}
