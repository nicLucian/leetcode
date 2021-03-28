package problem215;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionSolutionTest {
    PartitionSolution mPartitionSolution = new PartitionSolution();

    @Test
    public void testFindKthLargest() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        assertEquals(mPartitionSolution.findKthLargest(nums, 2), 5);
    }
}