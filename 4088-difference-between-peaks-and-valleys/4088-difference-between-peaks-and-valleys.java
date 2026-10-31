class Solution {
    public int peakValleyDifference(int[] nums) {
        int peak=0,valy=0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i+1]<nums[i]&&nums[i]>nums[i-1])
            {
                peak+=nums[i];
            }
            if(nums[i+1]>nums[i]&&nums[i]<nums[i-1])
            {
                valy+=nums[i];
            }
        }
        return peak-valy;
    }
}