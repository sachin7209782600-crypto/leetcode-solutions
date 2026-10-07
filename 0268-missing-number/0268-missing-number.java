class Solution {
    public int missingNumber(int[] nums) {
        int p=0,n=nums.length;
        p=(n*(n+1))/2;
        for(int i=0;i<nums.length;i++){
         p-=nums[i];
        }
         return p;
    }
}