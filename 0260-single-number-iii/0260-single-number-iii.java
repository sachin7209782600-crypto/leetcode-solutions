class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> wow=new HashMap<>();
        for(int i:nums)
        {
            if(wow.containsKey(i))
            {
                wow.put(i,wow.get(i)+1);
            }
            else
            {
                wow.put(i,1);
            }
        }
        int [] ans=new int[2];
        int p=0;
        for(int i:wow.keySet())
        {
            if(wow.get(i)==1)
            {
                ans[p]=i;
                p++;
            }
        }
            return ans;
    }
}