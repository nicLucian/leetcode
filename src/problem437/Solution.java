package problem437;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        LinkedList<Integer> path = new LinkedList<>();
        pathSum(root, targetSum, path);
        return result;
    }

    private void pathSum(TreeNode root, int targetSum, LinkedList<Integer> path) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(new ArrayList(path));
        }
        pathSum(root.left, targetSum - root.val, path);
        pathSum(root.right, targetSum - root.val, path);
        path.pollLast();
    }
}
