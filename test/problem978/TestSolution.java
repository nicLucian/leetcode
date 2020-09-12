package problem978;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void test() {
        int[] array = {9,4,2,10,7,8,8,1,9};
        Solution solution = new Solution();
        assertThat(5, equalTo(solution.maxTurbulenceSize(array)));
    }

    @Test
    public void test1() {
        int[] array = {4,8,12,16};
        Solution solution = new Solution();
        assertThat(2, equalTo(solution.maxTurbulenceSize(array)));
    }

    @Test
    public void test2() {
        int[] array = {100};
        Solution solution = new Solution();
        assertThat(1, equalTo(solution.maxTurbulenceSize(array)));
    }

    @Test
    public void test3() {
        int[] array = {100, 100, 100};
        Solution solution = new Solution();
        assertThat(1, equalTo(solution.maxTurbulenceSize(array)));
    }
}
