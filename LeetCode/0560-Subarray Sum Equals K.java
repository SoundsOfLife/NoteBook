class Solution {
    public int subarraySum(int[] nums, int k) {
       int ans = 0;
       Map<Integer, Integer> mii = new HashMap<>();
       mii.put(0, 1);
       int sum = 0;
       for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
           if (mii.containsKey(sum - k))
               ans += mii.get(sum - k);
           mii.put(sum, mii.getOrDefault(sum, 0) + 1);
       }
       return ans;
   }
}