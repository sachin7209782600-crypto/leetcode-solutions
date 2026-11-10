class Solution {
    public int climbStairs(int n, int[] costs) {
       int f=0,s=0,t=0;
       for(int i=0;i<n;i++)
       {
        int val=costs[i]+Math.min(t+1,Math.min(s+4,f+9));
        f=s;
        s=t;
        t=val;
       }
       return t;
    }
}