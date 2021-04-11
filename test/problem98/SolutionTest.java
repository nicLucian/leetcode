package problem98;

import org.junit.Test;
import util.TreeNode;
import util.TreeUtil;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testSolution() {
        Integer[] input = {2, 1, 3};
        TreeNode root = TreeUtil.buildTree(input);

        Solution solution = new Solution();
        assertTrue(solution.isValidBST(root));
    }

    @Test
    public void testSolution1() {
        Integer[] input = {5,1,4,null,null,3,6};
        TreeNode root = TreeUtil.buildTree(input);

        Solution solution = new Solution();
        assertFalse(solution.isValidBST(root));
    }

}