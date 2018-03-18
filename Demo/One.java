public class One{
    /**
     * 
     * 
     */

    public String one(String s,int n){
        StringBuffer ans = new StringBuffer(s.substring(n));
        ans.append(s.substring(0, n));
        return ans.toString();
    }


    public String test(String s,int n){
        StringBuffer sb = new StringBuffer(s);
        if(n >= s.length()){
            return sb.reverse().toString();
        }
        if(n * 2 > s.length()){
            return test(sb.reverse().toString(),s.length() - n);
        }else{
            for(int i = 0; i < n;i++){
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(n + 1 + i));
                sb.setCharAt(n + 1 + i, temp);
            }
            return test(sb.substring(0,sb.length() - 1 - n),n).append();
        }
    }

    public static void main(String[] args) {
        One one = new One();
        System.out.println(one.test("abcdedgh", 2));
    }
}