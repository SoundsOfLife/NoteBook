class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> mci = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            if(mci.containsKey(s.charAt(i))){
                mci.put(s.charAt(i), mci.get(s.charAt(i)) + 1);
            }else{
                mci.put(s.charAt(i), 1);
            }
        }
        for(int i = 0;i < s.length();i++){
            if(mci.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}