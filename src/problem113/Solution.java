package problem113;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        pathSum(root, targetSum, path);
        return result;
    }

    private void pathSum(TreeNode root, int targetSum, List<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(path);
            path = new ArrayList<>();
        }
        pathSum(root.left, targetSum - root.val, path);
        pathSum(root.right, targetSum - root.val, path);
        path.remove(Integer.valueOf(root.val));
    }
}
