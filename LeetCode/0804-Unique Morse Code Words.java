class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int ans = 0;
        Set<String> ret = new HashSet<>();
        for(int i = 0;i < words.length;i++){
            String temp = words[i];
            StringBuffer sb = new StringBuffer();
            for(int j = 0;j < temp.length();j++){
                sb.append(morse[temp.charAt(j)- 'a']);
            }
            ret.add(sb.toString());
        }

        return ret.size();
    }
}