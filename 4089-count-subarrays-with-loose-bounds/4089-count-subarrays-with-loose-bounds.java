class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0,ans=0;
        for(int i:nums)
        {
          if(minK<=i && i<=maxK)
          {
            count++;
          }
          else
          {
            if(count>0)
            {
            ans+=((count*(count+1))/2);
            count=0;
            }
          }
        }
        if(count!=0)
        {
            ans+=((count*(count+1))/2);
        }
        return ans;
    }
}