class Solution {
    public int[] countBits(int n) {
        int [] y=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int p=i,c=0;
            while(p>0)
            {
                if(p%2==0)
                {
                  p/=2;
                }
                else
                {
                   p-=1;
                   c++;
                   p/=2;
                }
            }
            y[i]=c;
        }
        return y;
    }
}