package problem239;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void maxSlidingWindow() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] expected = {3, 3, 5, 5, 6, 7};
        Solution solution = new Solution();
        assertArrayEquals(expected, solution.maxSlidingWindow(nums, k));
    }

}