package problem451;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void frequencySort() {
        Solution solution = new Solution();
        String input = "tree";
        assertThat("eert", equalTo(solution.frequencySort(input)));
    }
}