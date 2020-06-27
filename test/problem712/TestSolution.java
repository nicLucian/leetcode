package problem712;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        String s1 = "eat";
        String s2 = "sea";
        assertThat(231, equalTo(solution.minimumDeleteSum(s1, s2)));
    }

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        String s1 = "delete";
        String s2 = "leet";
        assertThat(403, equalTo(solution.minimumDeleteSum(s1, s2)));
    }
}
