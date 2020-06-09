package problem300;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testLengthOfLIS() {
        Solution solution = new Solution();
        int[] nums = {1,3,6,7,9,4,10,5,6};
        assertThat(solution.lengthOfLIS(nums), equalTo(6));
    }

    @Test
    public void testLengthOfLIS1() {
        Solution solution = new Solution();
        int[] nums = {10,9,2,5,3,7,101,18};
        assertThat(solution.lengthOfLIS(nums), equalTo(4));
    }

    @Test
    public void get0_when_nums_is_empty() {
        Solution solution = new Solution();
        int[] nums = {};
        assertThat(solution.lengthOfLIS(nums), equalTo(0));
    }
}
