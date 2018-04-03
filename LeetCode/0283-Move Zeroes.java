class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length > 1){
            int i = 0,j = 0;
            while(true){
                while(j < nums.length && nums[j] != 0)j++;
                i = j + 1;
                while(i < nums.length && nums[i] == 0)i++;
                if(i >= nums.length || j >= nums.length)
                    break;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
}