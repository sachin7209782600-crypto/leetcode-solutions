class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
           for(int k=0;k<n;k++)
           {
            if((matrix[i][j]==matrix[i][k])&&(k!=j))
            {
                return false;
            }
            if((matrix[i][j]==matrix[k][j])&&(k!=i))
            {
                return false;
            }
           }
          }
        }
        return true;
    }
}