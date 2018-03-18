class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = 1; i <= len / 2;i++){
            if(len % i == 0){
                StringBuffer sb = new StringBuffer(s.substring(0,i));
                for(int j = 1;j < len / i;j++){
                    sb.append(s.substring(0,i));
                }
                if(s.equals(sb.toString())){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean FASTrepeatedSubstringPattern(String s) {
        if(s.isEmpty()) { return true; }
        if(s.length() == 1) { return false; }
        int length = s.length();
        if(length % 2 == 0) {
            String firstSub = s.substring(0, (length / 3));
            return (s.substring(0, length / 2).equals(s.substring((length / 2), length))) || (
                    (firstSub.equals(s.substring(firstSub.length() * 2, firstSub.length() * 3)) &&
                            firstSub.equals(s.substring(firstSub.length(), firstSub.length() * 2))) &&
                            length % 3 == 0
                    );
        } else {
            String firstSub = s.substring(0, (length / 3));
            return firstSub.equals(s.substring(firstSub.length() * 2, firstSub.length() * 3)) &&
                   firstSub.equals(s.substring(firstSub.length(), firstSub.length() * 2));
        }
    }

}