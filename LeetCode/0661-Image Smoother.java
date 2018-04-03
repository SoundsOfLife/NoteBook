class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] ans = new int[M.length][M[0].length];
        int m = M.length,n = M[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                ans[i][j] = solve(M,m,n,i,j);
            }
        }
        return ans;
    }
    
    public int solve(int[][] M,int m,int n,int x, int y){
        int sum = M[x][y];
        int nums = 1;
        if(x - 1 >= 0){
            sum += M[x-1][y];
            nums++;
        }
        if(x-1 >= 0 && y - 1 >= 0){
            sum += M[x-1][y-1];
            nums++;
        }
        if(x - 1 >= 0 && y + 1 < n){
            sum += M[x-1][y+1];
            nums++;
        }
        if(x + 1 < m){
            sum += M[x + 1][y];
            nums++;
        }
        if(x + 1 < m && y - 1 >= 0){
            sum += M[x + 1][y - 1];
            nums++;
        }
        if(x + 1 < m && y + 1 < n){
            sum += M[x + 1][y + 1];
            nums++;
        }
        if(y - 1 >= 0){
            sum += M[x][y - 1];
            nums++;
        }
        if(y + 1 < n){
            sum += M[x][y + 1];
            nums++;
        }
        return sum / nums;
    }
}