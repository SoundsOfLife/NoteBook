class Solution {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        else if(nums.length == 1)
            return 1;
        else{
            int[][] dp = new int[nums.length][2];
            dp[0][0] = 1;
            dp[0][1] = 1;
            int max = 1;
            int ans = 1;
            for(int i = 1;i < nums.length;i++){
                int temp = 1;
                int count = 0;
                for(int j = 0;j < i;j++){
                    if(nums[i] > nums[j]){
                        if(dp[j][0] + 1 == temp){
                            temp = dp[j][0] + 1;
                            count += dp[j][1];
                        }else if(dp[j][0] + 1 > temp){
                            temp = dp[j][0] + 1;
                            count  = dp[j][1];
                        }
                    }
                }
                dp[i][0] = temp;
                dp[i][1] = count == 0 ? 1:count;
                if(temp == max){
                    ans += dp[i][1];
                }else if(temp > max){
                    max = temp;
                    ans = dp[i][1];
                }
            }
            return ans;
        }
    }
}