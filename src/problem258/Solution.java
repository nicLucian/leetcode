package problem258;

public class Solution {
    public int addDigit(int num) {
        int sumOfDigit = sumOfDigit(num);
        while (sumOfDigit >= 10) {
            sumOfDigit = sumOfDigit(sumOfDigit);
        }
        return sumOfDigit;
    }

    private int sumOfDigit(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num = num / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addDigit(318));
    }
}
