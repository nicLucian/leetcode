package problem583;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    private Solution mSolution;

    @Before
    public void init() {
        mSolution = new Solution();
    }

    @Test
    public void testSolution() {
        String word1 = "sea";
        String word2 = "eat";
        assertThat(2, equalTo(mSolution.minDistance(word1, word2)));
    }
}
