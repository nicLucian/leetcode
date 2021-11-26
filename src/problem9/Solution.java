package problem9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int originNum = x;
        int newNum = 0;
        int rem = 0;
        while (originNum > newNum) {
            rem = originNum % 10;
            newNum = newNum * 10 + rem;
            if (newNum == originNum) {
                return true;
            }
            originNum = originNum / 10;
        }
        return originNum == newNum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(1000));
    }
}
