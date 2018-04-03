class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuffer sb = new StringBuffer(A);
        int index = 1;
        while (sb.length() < B.length()) {
            sb.append(A);
            index++;
        }
        int temp = sb.length() - B.length();
        for (int i = 0; i <= temp; i++) {
            if (sb.substring(i, i + B.length()).equals(B)) {
                return index;
            }
        }
        sb.append(A);
        index++;
        for (int i = temp; i < sb.length() - B.length(); i++) {
            if (sb.substring(i, i + B.length()).equals(B)) {
                return index;
            }
        }
        return -1;
    }
}