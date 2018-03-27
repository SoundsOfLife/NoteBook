class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0;i < nums1.length;i++){
            int temp = -1;
            boolean flag = false;
            for(int j = 0;j < nums2.length;j++){
                if(nums2[j] == nums1[i]){
                    flag = true;
                }
                if(flag && nums2[j] > nums1[i]){
                    temp = nums2[j];
                    break;
                }
            }
            ans[i] = temp;
        }
        return ans;
    }
}