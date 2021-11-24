package problem7;

public class Solution {
    public int reverse(int x) {
        int result = 0;
        boolean neg = x < 0;
        x = neg ? -x : x;
        while (x > 0) {
            int rem = x % 10;
            if ((Integer.MAX_VALUE - rem) / 10 < result) {
                return 0;
            }
            result = result * 10 + rem;
            x = x / 10;
        }
        return neg ? -result : result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(123));
    }
}
