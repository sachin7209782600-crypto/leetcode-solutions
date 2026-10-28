class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int val:nums)
        {
            int count=0;
            while(val!=0)
            {
                val/=10;
                count++;
            }
            if(count%2==0)
            {
             ans++;
            }
        }
        return ans;
    }
}