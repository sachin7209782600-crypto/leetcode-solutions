class Solution {
    public int addRungs(int[] rungs, int dist) {
      int count=0,val=0;
      while(rungs[0]>val+dist)
      {
        val+=dist;
        count++;
      }
      for(int i=1;i<rungs.length;i++)
      {
       if(rungs[i-1]+dist>=rungs[i])
       continue;
       else
       {
        count+=(rungs[i]-rungs[i-1]-1)/dist;
       }
      }
      return count;
    }
}