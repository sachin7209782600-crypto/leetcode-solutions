class Solution {
    public int majorityElement(int[] nums) {
        int gret=0,ans=0;
        HashMap <Integer,Integer> wow=new HashMap<>();
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
            if(wow.get(x)>gret)
            {
            gret=wow.get(x);
            ans=x;
            }
        }
        return ans;
        
    }
}