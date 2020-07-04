package problem72;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        String word1 = "a";
        String word2 = "b";
        assertThat(solution.minDistance(word1, word2), equalTo(3));
    }

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        String word1 = "intention";
        String word2 = "execution";
        assertThat(solution.minDistance(word1, word2), equalTo(5));
    }
}
