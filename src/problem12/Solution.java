package problem12;

public class Solution {
    private static final String[][] ROMAN_DIGITS = {
            {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"M", "MM", "MMM"}
    };

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(1004));
    }


    public String intToRoman(int num) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int reminder = num % 10;
            num = num / 10;
            if (reminder == 0) {
                index++;
                continue;
            }
            sb.insert(0, ROMAN_DIGITS[index][reminder - 1]);
            index++;
        }
        return sb.toString();
    }


}
