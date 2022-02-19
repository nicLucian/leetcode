package problem338;

public class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = countOneBits(i);
        }
        return result;
    }

    private int countOneBits(int n) {
        int result = 0;
        while (n > 0) {
            if ((n & 0x1) == 1) {
                result++;
            }
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
//        Solution solution = new Solution();
        System.out.println((int) Math.pow(3, 21));
    }
}
