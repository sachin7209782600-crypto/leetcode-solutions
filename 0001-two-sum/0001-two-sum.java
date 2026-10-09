class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     hs.put(nums[i],target-nums[i]);
        //     if(nums[i]==target-nums[i])
        //     {
        //         first=i;
        //         last=target-nums[i];
        //         break;
        //     }
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(i!=first)
        //     {
        //         if(last==nums[i])
        //         {
        //             last=i;
        //         }
        //     }
        // }
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(target-nums[i]))
            {
                return new int[]{hs.get(target-nums[i]),i};
            }
                hs.put(nums[i],i);
        }
        return new int[]{};
        // return new int[]{first,last};
    }
}