package problem206;

import org.junit.Test;
import util.ListNode;
import util.ListUtil;

public class SolutionTest {
    Solution mSolution = new Solution();

    @Test
    public void reverseList() {
        int[] list = {1, 2, 3, 4, 5};
        ListNode head = ListUtil.buildList(list);
        ListUtil.walk(mSolution.reverseList(head));
    }
}