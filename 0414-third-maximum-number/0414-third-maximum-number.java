class Solution {
    public int thirdMax(int[] nums) {
     PriorityQueue<Integer> wow=new PriorityQueue<>();
     for(int i:nums)
     {
      if(wow.contains(i)) continue;
      wow.add(i);
      if(wow.size()>3)
      {
        wow.poll();
      }
     }
     if(wow.size()<3)
     {
        while(wow.size()>1)
        {
            wow.poll();
        }
     }
     return wow.peek();
    }
}