package problem125;

public class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            while (!valid(chars[start])) {
                start++;
            }
            while (!valid(chars[end])) {
                end--;
            }
            if (equals(chars[start], chars[end])) {
                start++;
                end--;
            } else {
                return false;
            }

        }
        return true;
    }

    private boolean valid(char char1) {
        return Character.isAlphabetic(char1) || Character.isDigit(char1);
    }

    private boolean equals(char char1, char char2) {
        if ('A' <= char1 && char1 <= 'Z') {
            char1 += ('a' - 'A');
        }

        if ('A' <= char2 && char2 <= 'Z') {
            char2 += ('a' - 'A');
        }

        return char1 == char2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "A man, a plan, a canal: Panama";
        solution.isPalindrome(str);
    }
}
