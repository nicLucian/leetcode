package problem202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            n = powSum(n);
            if (n == 1) {
                return true;
            }
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
        }
    }

    private int powSum(int n) {
        int result = 0;
        while (n != 0) {
            int rem = n % 10;
            result = rem * rem + result;
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(2));
    }
}
