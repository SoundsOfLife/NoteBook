class Solution {
    public int bulbSwitch2(int n) {
        return (int) Math.sqrt(n);
    }

    public int bulbSwitch(int n) {
        int ans = 0;
        for (int i = 1; ; i++)
            if (i * i <= n)
                ans++;
            else
                break;
        return ans;
    }
}