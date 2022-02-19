package problems;

import org.junit.Test;
import problmes.MaxArea_11;

import static org.junit.Assert.assertEquals;

public class TestMaxArea {
    @Test
    public void testMaxArea() {
        MaxArea_11 maxArea = new MaxArea_11();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, maxArea.maxArea(height));

        int[] height1 = {1, 1};
        assertEquals(1, maxArea.maxArea(height1));
    }
}
