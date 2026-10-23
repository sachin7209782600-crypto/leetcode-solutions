class Solution {
    public int sortPermutation(int[] nums) {
       int mx=-1;
       int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i])
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