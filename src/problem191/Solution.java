package problem191;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                result++;
            }
            n >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(0b11111111111111111111111111111101));
    }
}
