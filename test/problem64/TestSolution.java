package problem64;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testMinPathSum() {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        Solution solution = new Solution();
        assertThat(7, equalTo(solution.minPathSum(grid)));
    }
}
