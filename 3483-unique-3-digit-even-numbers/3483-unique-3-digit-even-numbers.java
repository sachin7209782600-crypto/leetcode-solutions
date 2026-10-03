class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        int ans=0;
        HashSet<Integer> wow=new HashSet();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
             {
               if(i!=j)
               {
               for(int k=0;k<n;k++)
                {
                 if(j!=k&&i!=k)
                   {

                   if(digits[i]!=0)
                     {
                       if(digits[k]%2==0)
                      {
                      ans=digits[i]*100+digits[j]*10+digits[k];
                      wow.add(ans);
                     }
                    }
                   }
                }
             }
            }
        }
        return wow.size() ;
    }
}