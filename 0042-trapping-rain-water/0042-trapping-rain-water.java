class Solution {
    public int trap(int[] height) {
     int [] lmax=new int[height.length];
     int [] rmax=new int[height.length];
     int count=0;
     int n=height.length-1;
     int lm=height[0];
     int rm=height[n];
     for(int i=0;i<height.length;i++)
     {
        if(height[i]>lm)
        {
        lmax[i]=height[i];
        lm=height[i];
        }
        else
        {
        lmax[i]=lm;
        }
        if(height[n]>rm)
        {
        rmax[n]=height[n];
        rm=height[n];
        }
        else
        {
         rmax[n]=rm;
        }
        n--;
     }
     for(int i=0;i<height.length;i++)
     {
     count+=(Math.min(lmax[i],rmax[i])-height[i]);
     }
     return count;
    }
}