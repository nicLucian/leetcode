package problem3;

import org.junit.Test;

import static org.junit.Assert.*;
public class SolutionTest {

    Solution mSolution = new Solution();

    @Test
    public void testLengthOfLongestSubstring() {
        String source = "abcabcbb";
        assertEquals(3, mSolution.lengthOfLongestSubstring(source));

        String source1 = "bbbbbb";
        assertEquals(1, mSolution.lengthOfLongestSubstring(source1));
    }
}