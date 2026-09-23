class Solution {
    public int maxSum(int[][] grid) {
        int ans=0;
        int sum=0;
        for(int i=2;i<grid.length;i++)
        {
           for(int j=2;j<grid[i].length;j++)
            {
            sum=0;
             sum=grid[i-2][j-2]+grid[i-2][j-1]+grid[i-2][j-0]+grid[i-1][j-1]+grid[i-0][j-2]+grid[i-0][j-1]+grid[i-0][j-0];
            ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}