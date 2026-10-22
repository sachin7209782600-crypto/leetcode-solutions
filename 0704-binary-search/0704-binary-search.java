class Solution {
    public int search(int[] nums, int target) {
        int s=0,l=nums.length-1,ans=-1;
        while(s<=l)
        {
            int mid=(s+l)/2;
            if(nums[mid]==target)
            {
             ans=mid;
             break;
            }
            if(nums[mid]<target)
            {
                s=mid+1;
            }
            if(nums[mid]>target)
            {
                l=mid-1;
            }
        }
        return ans;
    }
}