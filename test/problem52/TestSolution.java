package problem52;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testNQueens() {
        Solution solution = new Solution();
        int countOfSolutions = solution.totalNQueens(4);
        assertThat(2, equalTo(countOfSolutions));
    }
}
