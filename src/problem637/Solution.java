package problem637;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    //      Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> nodes = new ArrayDeque<>();
        List<Double> averages = new ArrayList<>();
        nodes.offer(root);
        while (!nodes.isEmpty())  {
            int size = nodes.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode current = nodes.poll();
                if (current.left != null) {
                    nodes.offer(current.left);
                }
                if (current.right != null) {
                    nodes.offer(current.right);
                }
                sum += current.val;
            }
            double average = sum / (size + 0.0);
            averages.add(average);
        }
        return averages;
    }
}
