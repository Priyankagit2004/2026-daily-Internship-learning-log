class DiceRollsWithTargetSum_1155 {
    public int numRollsToTarget(int n, int k, int target) {

        int MOD = 1000000007;

        // dp[t] = number of ways to get sum t
        int[] dp = new int[target + 1];

        // With 0 dice, sum 0 has exactly 1 way
        dp[0] = 1;

        for (int dice = 1; dice <= n; dice++) {

            int[] next = new int[target + 1];

            for (int sum = 1; sum <= target; sum++) {
                for (int face = 1; face <= k; face++) {

                    if (sum - face >= 0) {
                        next[sum] =
                            (next[sum] + dp[sum - face]) % MOD;
                    }
                }
            }

            dp = next;
        }

        return dp[target];
    }
}