class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cot=0;
        for(int i=m+n-1;i>=0;i--)
        {
         if(nums1[i]==0&&cot<n)
         {
            nums1[i]=nums2[cot];
            cot++;
         }
        }
        Arrays.sort(nums1);
    }
}