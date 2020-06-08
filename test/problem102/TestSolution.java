package problem102;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static problem102.Solution.TreeNode;

public class TestSolution {
    private Solution.TreeNode mRoot;

    @Before
    public void initTree() {
        mRoot = createNode(1);
        TreeNode node2 = createNode(2);
        TreeNode node3 = createNode(3);
        TreeNode node4 = createNode(4);
        TreeNode node5 = createNode(5);
        mRoot.left = node2;
        mRoot.right = node3;
        node2.left = node4;
        node2.right = node5;
    }

    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertThat(solution.levelOrder(mRoot), equalTo(expected()));
    }

    private List<List<Integer>> expected() {
        int[][] expectedArray = {
                {1},
                {2, 3},
                {4, 5},
        };
        List<List<Integer>> result = new ArrayList<>();
        for (int[] rows : expectedArray) {
            List<Integer> level = new ArrayList<>();
            for (int value : rows) {
                level.add(value);
            }
            result.add(level);
        }
        return result;
    }

    private TreeNode createNode(int value) {
        return new TreeNode(value);
    }
}
