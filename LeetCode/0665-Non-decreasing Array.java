class Solution {
    public boolean checkPossibility(int[] nums) {
        int num = 0;
        if (nums.length <= 2)
            return true;
        else {
            if (nums[1] >= nums[0]) {
                for (int i = 2; i < nums.length; i++)
                    if (!(nums[i] >= nums[i - 1])) {
                        if (nums[i] < nums[i - 2]) {
                            num++;
                            nums[i] = nums[i - 1];
                        }else{
                            num++;
                        }
                    }
            }else{
                num++;
                for (int i = 2; i < nums.length; i++)
                    if (!(nums[i] >= nums[i - 1])) {
                        if (nums[i] < nums[i - 2]) {
                            num++;
                            nums[i] = nums[i - 1];
                        }else
                            num++;
                        
                    }
            }
            return num <= 1;
        }
    }
}