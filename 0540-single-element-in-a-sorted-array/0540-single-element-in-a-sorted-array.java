class Solution {
    public int singleNonDuplicate(int[] nums) {
        int p=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            p^=nums[i];
        }
        return p;
    }
}