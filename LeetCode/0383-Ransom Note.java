class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        Map<Character,Integer> mci = new HashMap<>();
        for(int i = 0;i < m.length;i++){
            if(mci.containsKey(m[i])){
                mci.put(m[i], mci.get(m[i]) + 1);
            }else{
                mci.put(m[i], 1);
            }
        }
        boolean ans = true;
        for(int i = 0;i < r.length;i++){
            if(mci.containsKey(r[i])){
                if(mci.get(r[i]) > 0){
                    mci.put(r[i], mci.get(r[i]) - 1);
                }else{
                    ans = false;
                    break;
                }
            }else{
                ans = false;
                break;
            }
        }
        return ans;
    }
}