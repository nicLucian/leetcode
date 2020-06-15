package problem53;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = new Solution().maxSubArray(nums);
        assertThat(6, equalTo(expected));
    }
}
