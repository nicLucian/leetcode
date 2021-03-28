package problem5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution mSolution = new Solution();

    @Test
    public void testThreeSums() {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> source1 = Arrays.asList(-1, -1, 2);
        List<Integer> source2 = Arrays.asList(-1, 0, 1);
        expected.add(source1);
        expected.add(source2);

        assertEquals(expected, mSolution.threeSum(nums));
    }
}