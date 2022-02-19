package problem345;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (!vowels.contains(chars[left]) && left < right) {
                left++;
            }
            while (!vowels.contains(chars[right]) && left < right) {
                right--;
            }
            if (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
            }
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels(s));
    }
}
