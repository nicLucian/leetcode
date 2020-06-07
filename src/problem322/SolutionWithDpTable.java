package problem322;

import java.util.Arrays;

class SolutionWithDpTable {
    public int coinChange(int[] coins, int amount) {
        int[] table = new int[amount + 1];
        Arrays.fill(table, amount + 1);
        table[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                table[i] = Math.min(table[i], table[i - coin] + 1);
            }
        }
        return  (table[amount] == amount + 1) ? - 1 : table[amount];
    }
}
