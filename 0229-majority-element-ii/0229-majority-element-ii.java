class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList();
     HashMap<Integer,Integer> wow=new HashMap<>();
     for(int x:nums)
     {
        if(wow.containsKey(x))
        {
          wow.put(x,wow.get(x)+1);
        }
        else
        {
           wow.put(x,1);
        }
        if(wow.get(x)>nums.length/3)
        {
            if(!ans.contains(x))
            {
            ans.add(x);
            }
        }
     }      
       return ans;
    }
}