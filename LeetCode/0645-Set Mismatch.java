class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] n = new int[nums.length + 1];
        int[] ans = new int[2];
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            if(n[nums[i]]== 0){
                n[nums[i]] = 1;
            } else if(n[nums[i]] == 1){
                ans[0] = nums[i];
            }
            sum += nums[i];
        }
        ans[1] = (1 + nums.length) * nums.length / 2 - sum + ans[0];
        return ans;
    }
}