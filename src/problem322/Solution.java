package problem322;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[] coins = new int[]{186,419,83,408};
        int amount = 6249;
        Solution solution = new Solution();
        System.out.println(solution.coinChange(coins, amount));
    }

    public int coinChange(int[] coins, int amount) {
        Map<Integer, Integer> dpMap = new HashMap<>(amount);
        return dp(coins, amount, dpMap);
    }

    private int dp(int[] coins, int amount, Map<Integer,Integer> dpMap) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }
        Integer cache = dpMap.get(amount);
        if (cache != null) {
            return cache;
        }
        int result = amount + 1;
        for (int coin : coins) {
            int subProblem = (dp(coins, amount - coin, dpMap));
            if (subProblem < 0) {
                continue;
            }
            result = Math.min(result, 1 + subProblem);
        }
        result = result == amount + 1 ? -1 : result;
        dpMap.put(amount, result);
        return result;
    }

}
