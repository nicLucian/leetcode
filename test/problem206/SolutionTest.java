package problem206;

import org.junit.Test;
import src_util.ListNode;
import src_util.ListUtil;

public class SolutionTest {
    Solution mSolution = new Solution();

    @Test
    public void reverseList() {
        int[] list = {1, 2, 3, 4, 5};
        ListNode head = ListUtil.buildList(list);
        ListUtil.walk(mSolution.reverseList(head));
    }
}