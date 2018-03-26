class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0)
            return 0;
        int ans = 0;
        int[] up = new int[grid[0].length];
        int[] right = new int[grid.length];
        for(int i = 0;i < grid.length;i++){
            int p = 0;
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] >= p)
                    p = grid[i][j];
            }
            right[i] = p;
        }
        for(int i = 0;i < grid[0].length;i++){
            int p = 0;
            for(int j = 0;j < grid.length;j++){
                if(grid[j][i] >= p)
                    p = grid[j][i];
            }
            up[i] = p;
        }

        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                ans += (Math.min(right[i], up[j]) - grid[i][j]);
            }
        }
        
        return ans;
    }
}