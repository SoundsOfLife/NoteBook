class Solution {
    public int maximumSwap(int num) {
        if (num < 10) {
            return num;
        } else {
            return Integer.valueOf(sovle(String.valueOf(num)));
        }
    }

    public String sovle(String num) {
        if (num.length() <= 1)
            return num;
        else {
            StringBuffer sb = new StringBuffer(num);
            int[] index = new int[sb.length()];
            index[sb.length() - 1] = sb.length() - 1;
            for (int i = sb.length() - 2; i >= 0; i--) {
                if (sb.charAt(i) > sb.charAt(index[i + 1])) {
                    index[i] = i;
                } else {
                    index[i] = index[i + 1];
                }
            }
            for (int i = 0; i < sb.length(); i++) {
                if(sb.charAt(index[i]) != sb.charAt(i)){
                    char temp = sb.charAt(index[i]);
                    sb.setCharAt(index[i],sb.charAt(i));
                    sb.setCharAt(i,temp);
                    break;
                }
            }
            return sb.toString();
        }
    }
}