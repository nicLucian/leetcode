package problem3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        int length = s.length();
        int left = 0;
        int right = 0;
        Set<Character> window = new HashSet<>();

        while (right < length) {
            char rightTarget = s.charAt(right);
            right++;

            while (window.contains(rightTarget)) {
                char leftTarget = s.charAt(left);
                left++;
                window.remove(leftTarget);
            }

            window.add(rightTarget);
            maxLength = Math.max(maxLength, window.size());
        }

        return maxLength;
    }
}
