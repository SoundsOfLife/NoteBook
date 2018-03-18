class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length <= 1){
            return nums[0];
        }
        long a = Long.MIN_VALUE,b = Long.MIN_VALUE,c = Long.MIN_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == a || nums[i] == b || nums[i] == c){
                continue;
            }else{
                if(nums[i] > a){
                    c = b;
                    b = a;
                    a = nums[i];
                }else if(nums[i] > b){
                    c = b;
                    b = nums[i];
                }else if(nums[i] > c){
                    c = nums[i];
                }
            }
        }
        if(c == Long.MIN_VALUE || b == Long.MIN_VALUE){
            return (int)a;
        }else{
            return (int)c;
        }
    }
}