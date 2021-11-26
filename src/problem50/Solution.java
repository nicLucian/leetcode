package problem50;

public class Solution {
    public double myPow(double x, int n) {
        return n > 0 ? quickPow(x, n) : 1.0 / quickPow(x, -n);
    }

    private double quickPow(double x, int n) {
//        if (n == 0) {
//            return 1.0;
//        }
//        double y = quickPow(x, n / 2);
//        return n % 2 == 0 ? y * y : y * y * x;
        if (n == 0) {
            return 1.0;
        }
        double pow = quickPow(x, n / 2);
        return n % 2 == 0 ? pow * pow : pow * pow * x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2, -2147483648));
    }
}
