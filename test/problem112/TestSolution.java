package problem112;

import org.junit.Test;
import util.TreeNode;
import util.TreeUtil;

import static org.junit.Assert.assertTrue;

public class TestSolution {
    @Test
    public void testHasPathSum() {
        Integer[] source = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode treeNode = TreeUtil.buildTree(source);
        int sum = 22;

        Solution solution = new Solution();
        assertTrue(solution.hasPathSum(treeNode, sum));
    }
}
