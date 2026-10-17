class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int [][] check=new int[mat.length+2][mat[0].length+2];
        for(int i=0;i<mat.length+2;i++)
        {
        for(int j=0;j<mat[0].length+2;j++)
          {
            if(i==0||j==0||i==mat.length+1||j==mat[0].length+1)
            {
            check[i][j]=-1;
            }
            else
            {
                check[i][j]=mat[i-1][j-1];
            }
          }
        }
        int maxi=mat[0][0];
        for(int i=1;i<mat.length+1;i++)
        {
        for(int j=1;j<mat[0].length+1;j++)
          {
           if(check[i][j]>check[i-1][j]&&
              check[i][j]>check[i+1][j]&&
              check[i][j]>check[i][j-1]&&
              check[i][j]>check[i][j+1])
              {
                return new int []{i-1,j-1};
              }
          }
          
        }
        return new int[]{};
    }
}