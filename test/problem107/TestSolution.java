package problem107;

import org.junit.Test;
import src_util.TreeNode;
import src_util.TreeUtil;

import java.util.List;

public class TestSolution {
    @Test
    public void testLevelOrderBottom() {
        Integer[] source = {3,9,20,null,null,15,7};
        TreeNode treeNode = TreeUtil.buildTree(source);
        Solution solution = new Solution();
        List<List<Integer>> result = solution.levelOrderBottom(treeNode);
        System.out.println(result.toString());
    }
}
