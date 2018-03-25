class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int[] ans = new int[2];
        for(int i = 0;i < S.length();){
            int words = 0;
            while(i < S.length() && words <= 100){
                words += widths[S.charAt(i) - 'a'];
                if(words > 100){
                    ans[0]++;
                    words = 0;
                    break;
                }else{
                    i++;
                }
            }
            if(i >= S.length() && words >= 0){
                ans[0]++;
                ans[1] = words;
            }else{
                ans[1] = 100;
            }
        }
        return ans;
    }
}