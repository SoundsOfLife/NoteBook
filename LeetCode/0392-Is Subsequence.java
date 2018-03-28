class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for(int i = 0;i < t.length();i++){
            if(index == s.length()){
                break;
            }else{
                if(s.charAt(index)== t.charAt(i)){
                    index++;
                }
            }
        }
        return index == s.length()?true:false;
    }
}