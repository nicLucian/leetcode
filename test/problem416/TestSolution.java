package problem416;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolutionEven() {
        Solution solution = new Solution();
        int[] nums = {1, 5, 11, 5};
        assertThat(true, equalTo(solution.canPartition(nums)));
    }

    @Test
    public void testSolutionOdd() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 5};
        assertThat(false, equalTo(solution.canPartition(nums)));
    }

    @Test
    public void testSolutionEmpty() {
        Solution solution = new Solution();
        int[] nums = {};
        assertThat(true, equalTo(solution.canPartition(nums)));
    }
}
