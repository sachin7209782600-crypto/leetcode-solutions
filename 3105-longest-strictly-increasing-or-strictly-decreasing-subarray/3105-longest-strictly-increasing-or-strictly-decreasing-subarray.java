class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1,dec=1;
        int maxi=nums[0];
        int mini=nums[0];
        int ans=1;
        for(int i=1;i<nums.length;i++)
        {
            if(maxi<nums[i])
            {
                inc++;
                maxi=nums[i];
            }
            else
            {
                inc=1;
                maxi=nums[i];
            }
            if(mini>nums[i])
            {
                dec++;
                mini=nums[i];
            }
            else
            {
                dec=1;
                mini=nums[i];
            }
            ans=Math.max(ans,Math.max(inc,dec));
        }
      return ans;
    }
}