class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = grid[0][0];
        for (int i = 2; i <= m; i++)
            dp[i][1] = grid[i - 1][0] + dp[i - 1][1];
        for (int i = 2; i <= n; i++)
            dp[1][i] = grid[0][i - 1] + dp[1][i - 1];
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return dp[m][n];
    }
}