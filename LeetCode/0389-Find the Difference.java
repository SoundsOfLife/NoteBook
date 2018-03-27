class Solution {
    public char findTheDifference(String s, String t) {
        char[] x = s.toCharArray();
        char[] y = t.toCharArray();
        int[] nums = new int[26];
        for(int i = 0;i < x.length;i++){
            nums[x[i] - 'a']++;
            nums[y[i] - 'a']--;
        }
        char ans = 'a';
        nums[y[y.length - 1] - 'a']--;
        for(int i = 0;i < 26;i++){
            if(nums[i] != 0){
                ans = (char)(i + 'a');
            }
        }
        return ans;
    }
}