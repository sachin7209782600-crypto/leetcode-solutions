class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> wow=new HashSet();
      wow.add(nums[0]);
      for(int i=1;i<nums.length;i++)
      {
        if(wow.contains(nums[i]))
        {
            return true;
        }
        else
        {
            wow.add(nums[i]);
        }
      }
      return false;
    }
}