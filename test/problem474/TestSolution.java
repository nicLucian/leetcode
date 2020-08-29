package problem474;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int m = 5;
        int n = 3;
        String[] array = {"10", "0001", "111001", "1", "0"};
        assertThat(4, equalTo(solution.findMaxForm(array, m, n)));
    }
}
