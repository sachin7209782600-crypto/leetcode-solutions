class Solution {
    public int countServers(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
           for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    int ck=0;
                 for(int k=0;k<grid[0].length;k++)
                 {
                    if(grid[i][k]==1&&k!=j)
                    {
                    count++;
                    ck=1;
                    break;
                    }
                 }
                 if(ck!=1)
                 {
                 for(int k=0;k<grid.length;k++)
                 {
                    if(grid[k][j]==1&&k!=i)
                    {
                    count++;
                    break;
                    }
                 }
                 }
                }
            }
        }
        return count;

    }
}