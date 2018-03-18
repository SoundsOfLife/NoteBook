class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length <= 1){
            return nums[0];
        }else{
            for(int i = 1;i < nums.length;i++){
                nums[0] = nums[0]^nums[i];
            }
            return nums[0];
        }
    }
}