class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> wow=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(wow.containsKey(nums[i]))
            {
                if(Math.abs(wow.get(nums[i])-i)<=k)
                {
                    return true;
                }
                else
                {
                    wow.remove(nums[i],wow.get(nums[i]));
                    wow.put(nums[i],i);
                }
            }
            else
            {
                wow.put(nums[i],i);
            }
        }
       return false;
    }
}