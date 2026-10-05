class Solution {
    public int maxProduct(int[] nums) {
        int p=1;
        int f=nums[0];
        int n=nums.length-1;
        int g=1;
        for (int i=0;i<nums.length;i++)
        {
            g*=nums[n];
            p*=nums[i];
            f=Math.max(f,Math.max(p,Math.max(nums[i],g)));
            if(p==0)
            {p=1;}
            if(g==0)
            {g=1;}
            n--;
        }
        return f;
    }
}