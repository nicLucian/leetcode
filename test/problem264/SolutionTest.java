package problem264;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void nthUglyNumber() {
        Solution solution = new Solution();
        assertThat(solution.nthUglyNumber(10), equalTo(12));

        assertThat(solution.nthUglyNumber(9), equalTo(10));
    }
}