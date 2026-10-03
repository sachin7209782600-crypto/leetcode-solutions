class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> hs1=new HashSet();
    HashSet<Integer> hs2=new HashSet();
    for(int i=0;i<nums1.length;i++)
    {
     hs1.add(nums1[i]);
    }
    for(int i=0;i<nums2.length;i++)
    {
     hs2.add(nums2[i]);
    }
     hs1.retainAll(hs2);
     int []ans=new int[hs1.size()];
     int i=0;
     for(int x:hs1)
     {
        ans[i]=x;
        i++;
     }
     return ans;
    }
}