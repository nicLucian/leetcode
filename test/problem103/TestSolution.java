package problem103;

import org.junit.Test;
import util.TreeNode;
import util.TreeUtil;

import java.util.List;

public class TestSolution {
    @Test
    public void testZigzag() {
        Solution solution = new Solution();
        Integer[] source = {3, 9, 20, null, null, 15, 7};
        TreeNode node = TreeUtil.buildTree(source);
        List<List<Integer>> result = solution.zigzagLevelOrder(node);
        System.out.println(result.toString());
    }
}
