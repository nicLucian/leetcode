package problem13;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        char[] roman = s.toCharArray();
        int result = 0;
        for (int i = 0; i < roman.length; i++) {
            int current = charToInt(roman[i]);
            int nextIndex = i + 1;
            int next = nextIndex == roman.length ? 0 : charToInt(roman[nextIndex]);
            if (next > current) {
                result = result - current + next;
                i ++;
            } else {
                result = result + current;
            }
        }
        return result;
    }

    private int charToInt(char target) {
        switch (target) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
