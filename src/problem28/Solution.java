package problem28;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("aaaaaaa", "bba"));
        System.out.println(solution.strStr("aaaaaaa", ""));
    }

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        int currentHaystackIndex = 0;
        int needleIndex = 0;
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        while (currentHaystackIndex + needleLength <= haystackLength) {
            for (needleIndex = 0; needleIndex < needleLength; needleIndex++) {
                if (haystack.charAt(currentHaystackIndex + needleIndex) != needle.charAt(needleIndex)) {
                    break;
                }
            }
            if (needleIndex == needleLength) {
                return currentHaystackIndex;
            }
            currentHaystackIndex++;
        }
        return -1;
    }
}
