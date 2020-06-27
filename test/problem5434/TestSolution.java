package problem5434;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[] nums =  {1, 1, 0, 1};
        assertThat(3, equalTo(solution.longestSubarray(nums)));
    }

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        int[] nums =  {0,1,1,1,0,1,1,0,1};
        assertThat(5, equalTo(solution.longestSubarray(nums)));
    }

    @Test
    public void testSolution2() {
        Solution solution = new Solution();
        int[] nums =  {1,1,0,0,1,1,1,0,1};
        assertThat(4, equalTo(solution.longestSubarray(nums)));
    }

    @Test
    public void testSolution3() {
        Solution solution = new Solution();
        int[] nums =  {0, 0, 0};
        assertThat(0, equalTo(solution.longestSubarray(nums)));
    }
}
