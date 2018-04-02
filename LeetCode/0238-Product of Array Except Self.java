class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[][] dp = new int[nums.length][2];
        dp[0][0] = nums[0];
        dp[nums.length - 1][1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = nums[i] * dp[i - 1][0];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            dp[i][1] = dp[i + 1][1] * nums[i];
        }
        ans[0] = dp[1][1];
        ans[nums.length - 1] = dp[nums.length - 2][0];
        for (int i = 1; i < nums.length - 1; i++) {
            ans[i] = dp[i - 1][0] * dp[i + 1][1];
        }
        return ans;
    }
}