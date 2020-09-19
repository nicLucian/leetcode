package problem347;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void topKFrequent() {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        Solution solution = new Solution();
        int[] expected = {1, 2};
        assertThat(expected, equalTo(solution.topKFrequent(nums, k)));
    }

}