class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        if (nums == null || nums.length == 0)
            return ans;
        else {
            int temp = nums[0];
            ans += (temp < k ? 1 : 0);
            for (int i = 0, j = 1; i <= j && j < nums.length && i < nums.length; ) {
                temp = temp * nums[j];
                if (nums[j] < k) {
                    ans++;
                    if (temp < k)
                        ans += (j - i);
                    else {
                        while (temp >= k) {
                            temp = temp / nums[i];
                            i++;
                        }
                        ans += (j - i);
                    }
                    j++;
                } else {
                    j++;
                    i = j;
                    temp = 1;
                }

            }
            return ans;
        }
    }
}