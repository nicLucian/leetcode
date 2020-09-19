package problem215;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TestSolution {
    @Test
    public void testSolution() {
        int[] array = {2, 1, 3};
        HeapSort heapSort = new HeapSort();
        heapSort.heapify(array, array.length);

        int[] expected = {3, 1, 2};
        assertThat(expected, equalTo(array));
    }

    @Test
    public void testSolution1() {
        int[] array = {1, 12, 9, 5, 6, 10};
        HeapSort heapSort = new HeapSort();
        heapSort.heapify(array, array.length);

        int[] expected = {12, 6, 10, 5, 1, 9};
        assertThat(expected, equalTo(array));
    }

    @Test
    public void testSort() {
        int[] array = {12, 6, 10, 5, 1, 9};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        int[] expected = {1, 5, 6, 9, 10, 12};
        assertThat(array, equalTo(expected));
    }

    @Test
    public void testFindKthLarges() {
        int[] array = {3,2,1,5,6,4};
        int k = 2;
        Solution solution = new Solution();
        assertThat(5, equalTo(solution.findKthLargest(array, 2)));
    }
}
