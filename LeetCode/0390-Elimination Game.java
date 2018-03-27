class Solution {
    public int lastRemaining(int n) {
        if(n <= 2){
            return n;
        }else{
            if(n % 2 == 1)
                return lastRemaining(n - 1);
            else{
                if(n % 4 == 0)
                    return 4 * lastRemaining(n / 4) - 2;
                else
                    return 4 * lastRemaining(n / 4);
            }
        }
    }
}