package problem988;

import util.TreeNode;
import util.TreeUtil;

public class Solution {
    private String mResult;

    private StringBuilder mBuilder = new StringBuilder();

    public String smallestFromLeaf(TreeNode root) {
        if (root == null) {
            return "";
        }
        walk(root);
        return mResult;
    }

    private void walk(TreeNode root) {
        if (root == null) {
            return;
        }
        mBuilder.append((char) ('a' + root.val));
        walk(root.left);
        walk(root.right);
        if (root.left == null && root.right == null) {
            String current = mBuilder.reverse().toString();
            mBuilder.reverse();
            if (mResult == null) {
                mResult = current;
            } else if(mResult.compareTo(current) > 0) {
                mResult = current;
            }
        }
        mBuilder.deleteCharAt(mBuilder.length() - 1);
    }

    public static void main(String[] args) {
        Integer[] nums = {25,1,3,1,3,0,2};
        TreeNode root = TreeUtil.buildTree(nums);
        Solution solution = new Solution();
        System.out.println(solution.smallestFromLeaf(root));
    }
}
