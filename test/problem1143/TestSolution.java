package problem1143;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        String text1 = "abcde";
        String text2 = "ace";
        assertThat(3, equalTo(solution.longestCommonSubsequence(text1, text2)));
    }
}
