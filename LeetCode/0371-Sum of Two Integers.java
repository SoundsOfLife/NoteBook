class Solution {
    public int getSum(int a, int b) {
        if(b == 0)
            return a;
        int c = a ^ b;
        int d = a&b;
        return getSum(c, d << 1);
    }
}