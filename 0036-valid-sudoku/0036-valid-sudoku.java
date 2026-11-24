class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                  for(int k=0;k<9;k++)
                  {
                    if((board[i][j]==board[i][k])&&(k!=j))
                    {
                        return false;
                    }               
                    if((board[i][j]==board[k][j])&&(k!=i))
                    {
                        return false;
                    }
                  }
                int r=(i/3)*3;
                int c=(j/3)*3;
                for(int a=r;a<r+3;a++)
                {
                   for(int b=c;b<c+3;b++)
                   {
                    if((board[i][j]==board[a][b])&&(a!=i || b!=j))
                    {
                        return false;
                    }
                   }
                }
                }
            }
        }
        return true;
    }
}