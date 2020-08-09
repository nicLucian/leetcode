package problem877;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testStoneGame() {
        Solution solution = new Solution();
        int[] piles = {3, 9, 1 ,2};
        assertThat(true, equalTo(solution.stoneGame(piles)));
    }

    @Test
    public void testStoneGame1() {
        Solution solution = new Solution();
        int[] piles = {5, 3, 4 ,5};
        assertThat(true, equalTo(solution.stoneGame(piles)));
    }
}
