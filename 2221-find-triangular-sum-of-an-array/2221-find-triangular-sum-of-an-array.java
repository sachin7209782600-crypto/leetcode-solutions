class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        for(int i=0;i<nums.length;i++)
        {
            n--;
            for(int j=1;j<=n;j++)
            {
            if(nums[j-1]+nums[j]<10)
            {
            nums[j-1]=nums[j-1]+nums[j];
            }
            else
            {
                nums[j-1]=(nums[j] + nums[j-1]) % 10;
            }
            }
        }
        return nums[0];
    }
}