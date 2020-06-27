package problem5433;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        assertThat(3, equalTo(solution.kthFactor(12, 3)));
        assertThat(7, equalTo(solution.kthFactor(7, 2)));
        assertThat(-1, equalTo(solution.kthFactor(4, 4)));
        assertThat(4, equalTo(solution.kthFactor(1000, 3)));
    }
}
