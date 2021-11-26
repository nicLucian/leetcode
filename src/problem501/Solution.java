package problem501;

import util.TreeNode;

import java.util.*;

public class Solution {
    private int mCurrentNum;
    private int mMaxCount = 0;
    private List<Integer> mMaxCountNums = new ArrayList<>();
    private int mCurrentCount;

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        mCurrentNum = root.val;
        mMaxCount = 1;
        walk(root);

        int[] result = new int[mMaxCountNums.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = mMaxCountNums.get(i);
        }
        return result;
    }

    private void walk(TreeNode node) {
        if (node == null) {
            return;
        }
        walk(node.left);
        update(node);
        walk(node.right);
    }

    private void update(TreeNode node) {
        if (node.val == mCurrentNum) {
            mCurrentCount++;
            if (mCurrentCount > mMaxCount) {
                mMaxCount = mCurrentCount;
                mMaxCountNums.clear();
                mMaxCountNums.add(mCurrentNum);
            } else if (mCurrentCount == mMaxCount) {
                mMaxCountNums.add(mCurrentNum);
            }
        } else {
            mCurrentNum = node.val;
            mCurrentCount = 1;
            if (mCurrentCount == mMaxCount) {
                mMaxCountNums.add(mCurrentNum);
            }
        }
    }
}
