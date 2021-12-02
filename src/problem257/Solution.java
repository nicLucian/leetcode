package problem257;

import util.TreeNode;
import util.TreeUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        binaryTreePaths(root, new ArrayList<>(), result);
        return result;
    }

    private void binaryTreePaths(TreeNode root, List<Integer> level, List<String> result) {
        if (root != null) {
            level.add(root.val);
            if (root.left == null && root.right == null) {
                result.add(toString(level));
                // return;
            } else {
                binaryTreePaths(root.left, level, result);
                binaryTreePaths(root.right, level, result);
            }
            level.remove(level.size() - 1);
        }
    }

    private String toString(List<Integer> level) {
        StringBuilder sb = new StringBuilder();
        for (Integer num : level) {
            sb.append(num);
            sb.append("->");
        }
//        sb.deleteCharAt(sb.length() - 1);
//        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, null, 5};
        TreeNode root = TreeUtil.buildTree(nums);
        Solution solution = new Solution();
        System.out.println(solution.binaryTreePaths(root));
    }
}
