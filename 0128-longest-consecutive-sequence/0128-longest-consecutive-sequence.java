class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       int count=1,maxi=0;
       if(nums.length<2)
       {
        return nums.length;
       }
      for(int i=1;i<nums.length;i++)
      {
        if(nums[i-1]+1==nums[i])
        {
            count++;
        }
        else if(nums[i-1]==nums[i])
        {

        }
        else
        {
            count=1;
        }
        maxi=Math.max(count,maxi);
      }
      return maxi;
    }
}