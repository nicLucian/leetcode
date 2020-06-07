package problem322;

import org.junit.Test;


import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        SolutionWithDpTable solution = new SolutionWithDpTable();
        int result = solution.coinChange(coins, amount);
        int expect = 3;
        assertThat(result, equalTo(expect));
    }

    @Test
    public void testSolutionNoSolution() {
        int[] coins = {2};
        int amount = 3;
        SolutionWithDpTable solution = new SolutionWithDpTable();
        int result = solution.coinChange(coins, amount);
        int expect = -1;
        assertThat(result, equalTo(expect));
    }

    @Test
    public void get3_When_CoinsIs1_AmountIs3() {
        int[] coins = {1};
        int amount = 3;
        SolutionWithDpTable solution = new SolutionWithDpTable();
        int result = solution.coinChange(coins, amount);
        int expect = 3;
        assertThat(result, equalTo(expect));
    }
}
