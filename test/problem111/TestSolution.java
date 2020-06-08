package problem111;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static problem111.Solution.TreeNode;

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
        assertThat(2, equalTo(solution.minDepth(mRoot)));
    }

    private Solution.TreeNode createNode(int value) {
        return new Solution.TreeNode(value);
    }
}
