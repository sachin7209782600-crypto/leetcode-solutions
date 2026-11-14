class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum=0,ans=9999999,c=0;
        for(int i=0;i<nums.size();i++)
        {
          for(int j=l+i;j<=nums.size()&&j<=r+i;j++)
          {
          List<Integer> ants=nums.subList(i,j);
          sum=0;
          for(int p:ants)
          {
            sum+=p;
          }
          if(sum>0)
          {
          ans=Math.min(ans,sum);
          c++;
          }
          }
        }
        if(c==0)
        {
            return -1;
        }
        return ans;
    }
}