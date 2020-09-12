package problem62;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertThat(3, equalTo(solution.uniquePaths(3, 2)));
    }
}
