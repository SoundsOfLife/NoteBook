class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        else if(nums.length == 1)
            return 1;
        int[] dp = new int[nums.length];
        int ans = 1;
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                dp[i] = dp[i - 1] + 1;
            else
                dp[i] = 1;
            if (ans <= dp[i])
                ans = dp[i];
        }
        return ans;
    }
}