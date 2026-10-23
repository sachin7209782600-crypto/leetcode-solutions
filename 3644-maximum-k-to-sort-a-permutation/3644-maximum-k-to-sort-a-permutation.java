class Solution {
    public int sortPermutation(int[] nums) {
       int[]wow=new int[nums.length];
       int p=0;
       for(int i:nums)
       {
        wow[p]=i;
        p++;
       }
       Arrays.sort(wow);
       int mx=-1;
       int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(wow[i]!=nums[i])
            {
            mx=mx & nums[i];
            count++;
            }
        }
        if(count==0)
        {
            return 0;
        }
        return mx;
    }
}