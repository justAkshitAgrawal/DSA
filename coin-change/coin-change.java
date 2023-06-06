class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] cache = new int[amount+1];
        Arrays.fill(cache, amount+1);

        cache[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                cache[i] = Math.min(cache[i], cache[i-coin] + 1);
            }
        }

        return cache[amount] <= amount ? cache[amount] : -1;
    }
}