package problem637;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertThat(solution.averageOfLevels(buildTreeNode()), equalTo(buildAverageList()));
    }

    private List<Double> buildAverageList() {
        List<Double> expected = new ArrayList<>();
        expected.add(3d);
        expected.add(14.5);
        expected.add(11d);
        return expected;
    }

    private Solution.TreeNode buildTreeNode() {
        Solution.TreeNode node3 = new Solution.TreeNode(3);
        Solution.TreeNode node9 = new Solution.TreeNode(9);
        Solution.TreeNode node20 = new Solution.TreeNode(20);
        Solution.TreeNode node15 = new Solution.TreeNode(15);
        Solution.TreeNode node7 = new Solution.TreeNode(7);
        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;
        return node3;
    }

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        assertThat(solution.averageOfLevels(buildTreeNode1()), equalTo(buildAverageList1()));
    }

    private List<Double> buildAverageList1() {
        List<Double> expected = new ArrayList<>();
        expected.add(2147483647D);
        expected.add(2147483647D);
        return expected;
    }

    private Solution.TreeNode buildTreeNode1() {
        Solution.TreeNode node2 = new Solution.TreeNode(2147483647);
        Solution.TreeNode node9 = new Solution.TreeNode(2147483647);
        Solution.TreeNode node20 = new Solution.TreeNode(2147483647);
        node2.left = node9;
        node2.right = node20;
        return node2;
    }
}
