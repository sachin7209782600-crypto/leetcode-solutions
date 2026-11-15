class Solution {
    public int numOfSubarrays(int[] arr) {
        int es=0,os=0,sum=0;
        for(int i:arr)
        {
            sum+=i;
            if(sum%2==0)
            {
                es++;
            }
            else
            {
                os++;
            }
        }
        return (int)((1L*(++es)*os)%1000000007);
    }
}