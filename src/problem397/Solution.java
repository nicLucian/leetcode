package problem397;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int integerReplacement(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            Integer mapValue = map.get(n / 2);
            if (mapValue == null) {
                mapValue = integerReplacement(n / 2);
                map.put(n / 2, mapValue);
            }
            return map.get(n / 2) + 1;
        } else {
            Integer leftKey = (n + 1) / 2;
            Integer leftValue = map.get(leftKey);
            if (leftValue == null) {
                map.put(leftKey, integerReplacement(leftKey));
            }

            Integer rightKey = (n - 1) / 2;
            Integer rightValue = map.get(rightKey);
            if (rightValue == null) {
                map.put(rightKey, integerReplacement(rightKey));
            }
            return Math.min(map.get(rightKey) + 1, map.get(leftKey) + 1) + 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerReplacement(1000));
    }
}
