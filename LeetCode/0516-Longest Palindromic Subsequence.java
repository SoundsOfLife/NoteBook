class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] a = s.toCharArray();
        char[] b = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            char temp = b[i];
            b[i] = b[s.length() - 1 - i];
            b[s.length() - 1 - i] = temp;
        }
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= s.length(); j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[s.length()][s.length()];
    }
}