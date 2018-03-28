class Solution {
    public int triangleNumber(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 2;i++){
            int index = i + 2;
            for(int j = i + 1;j < nums.length - 1;j++){
                while(index <= j)
                    index++;
                while(index < nums.length && nums[i] + nums[j] > nums[index]){
                    index++;
                }
                ans += (index - j - 1);
            }
        }
        return ans;
    }
}