public class StringAlgorithm{

    public int KMP(String source,String target){
        if(source.length() < target.length()){
            return -1;
        }else{
            int index = -1;
            int[] pmt = new int[target.length()];
            pmt[0] = 0;
            for(int i = 1;i < target.length();i++){
                for(int j = i;j > 0;j--){
                    if(target.substring(0,j).equals(target.substring(i + 1 - j,i + 1))){
                        pmt[i] = j;
                        break;
                    }
                }
            }
            
            return index;
        }
    }

    public String reverse(String str){
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < sb.length() / 2;i++){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length() - 1 - i));
            sb.setCharAt(sb.length() - 1 - i, temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringAlgorithm s = new StringAlgorithm();
        s.KMP("asdasdassdasdas", "abababca");
    }
}