class Solution {
    public long maxAlternatingSum(int[] nums) {
        long [] ans=new long[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(ans);
        long sum=0;
        int first=0,last=nums.length-1;
        while(first<=last)
        {
            sum+=ans[last];
            last--;
            if(first<=last)
            {
            sum-=ans[first];
            first++;
            }
        }
       return sum;
    }
}