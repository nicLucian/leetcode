package problem10;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        String text ="aab";
        String pattern = "c*a*b";
        assertThat(solution.isMatch(text, pattern), equalTo(true));
    }

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        String text ="ab";
        String pattern = ".*";
        assertThat(solution.isMatch(text, pattern), equalTo(true));
    }
}
