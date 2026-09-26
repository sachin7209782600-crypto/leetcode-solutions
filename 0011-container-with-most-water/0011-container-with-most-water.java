class Solution {
    public int maxArea(int[] height) {
      int length=height.length-1; 
     int first =0;
     int last=height.length-1;
     int countains=0;
     int ans=0;
     while(first<last)
     {
        if(height[first]<height[last])
        {
            countains=length*height[first];
            first++;
            length--;
        }
        else
        {
            countains=length*height[last];
            last--;
            length--;
        }
      ans=Math.max(ans,countains);
     }
     return ans;
    }
}