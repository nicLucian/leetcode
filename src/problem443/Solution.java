package problem443;

import java.util.Arrays;

public class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0 || chars.length == 1) {
            return chars.length;
        }
        int modifyIndex = 0;
        int fastIndex = 1;
        int slowIndex = 0;
        while (fastIndex < chars.length) {
            if (chars[fastIndex] != chars[slowIndex] || fastIndex == chars.length - 1) {
                if (fastIndex == chars.length - 1) {
                    fastIndex ++;
                }
                int length = fastIndex - slowIndex;
                chars[modifyIndex++] = chars[slowIndex];
                if (length > 1) {
                    while (length  > 0) {
                        chars[modifyIndex++] = (char) ('0' + (length % 10));
                        length = length / 10;
                    }
                }
                slowIndex = fastIndex;
                fastIndex++;
            } else {
                fastIndex++;
            }
        }

        return modifyIndex;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a', 'b','b','c','c','c'};
        Solution solution = new Solution();
        System.out.println(solution.compress(chars));
        System.out.println(Arrays.toString(chars));
    }
}
