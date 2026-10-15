class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
        for(int j=i;j<=nums.size();j++)
        {
        List<Integer> ans=nums.subList(i,j);
        HashSet<Integer> wow=new HashSet<>(ans);
        sum+=(wow.size()*wow.size());
        }
        }
        return sum;
    }
}