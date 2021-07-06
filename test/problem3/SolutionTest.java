package problem3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testBacktrace() {
        String[] array = {"a", "b", "c", "d"};
        List<String> chars = new ArrayList<>();
        List<String> res = new ArrayList<>();
        backtrace(array, chars, res);
        System.out.println(res);
    }

    private void backtrace(String[] array, List<String> characters, List<String> res) {
        if (characters.size() == array.length) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : characters) {
                stringBuilder.append(str);
            }
            res.add(stringBuilder.toString());
            return;
        }
        for (String ch : array) {
            if (!characters.contains(ch)) {
                characters.add(ch);
                backtrace(array, characters, res);
                characters.remove(ch);
            }
        }
    }


}