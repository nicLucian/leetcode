package problem151;

public class Solution {
    public String reverseWords(String s) {
        String trimString = trimSpace(s);
        char[] chars = trimString.toCharArray();
        reverse(chars, 0, chars.length - 1);
        reverseWords(chars);
        return String.valueOf(chars);
    }

    private String trimSpace(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            boolean needInsert = sb.length() == 0 || (sb.charAt(sb.length() - 1) != ' ') || (ch != ' ');
            if (needInsert) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
    }

    private void reverseWords(char[] chars) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                end = i - 1;
                reverse(chars, start, end);
                start = i + 1;
            }
            if (i == chars.length - 1) {
                reverse(chars, start, chars.length - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseWords("  Bob    Loves  Alice   ");
    }
}
