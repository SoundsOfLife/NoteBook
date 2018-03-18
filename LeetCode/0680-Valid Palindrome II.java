class Solution {
    public boolean validPalindrome(String s) {
        int nums = -1;
        for(int i = 0;i < s.length() / 2 + 1;i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                nums = i;
                break;
            }
        }
        if(nums == -1){
            return true;
        }else{
            return judge(s.substring(0,nums)+s.substring(nums+1)) || judge(s.substring(0,s.length() - 1 - nums) + s.substring(s.length() - nums)); 
        }
    }
    
    public boolean judge(String s){
        boolean ans = true;
        for(int i = 0;i < s.length() / 2+1;i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                ans = false;
                break;
            }
        }
        return ans;
    }
}