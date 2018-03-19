class Solution {
    public int search(int[] nums, int target) {
         if(nums.length == 0){
             return -1;
         }
         int index = binSearch(nums, target, 0, nums.length - 1);
         return index;
     }
 
     public int binSearch(int[] nums,int target,int left,int right){
         if(left >= right){
             return nums[left] == target?left:-1;
         }
         int mid = (right + left) / 2;
         if(nums[mid] == target){
             return mid;
         }else{
             if(nums[left] == target){
                 return left;
             }
             if(nums[right] == target){
                 return right;
             }
             if(nums[mid] > nums[left] && nums[mid] < nums[right]){
                 if(nums[mid] > target)
                     return binSearch(nums, target, left, mid);
                 else
                     return binSearch(nums, target, mid+1, right);
             }else if(nums[mid] > nums[left] && nums[mid] > nums[right]){
                 if(nums[mid] > target){
                     if(nums[left] > target){
                         return binSearch(nums, target, mid+1, right);
                     }else{
                         return binSearch(nums, target, left, mid);
                     }
                 }else{
                     return binSearch(nums, target, mid+1, right);
                 }
             }else if(nums[mid] < nums[left] && nums[mid] < nums[right]){
                 if(nums[mid] > target)
                     return binSearch(nums, target, left, mid);
                 else{
                     if(nums[left] > target){
                         return binSearch(nums, target, mid+1, right);
                     }else{
                         return binSearch(nums, target, left, mid);
                     }
                 }
             }else{
                 return -1;
             }
         }
     }
     
 }