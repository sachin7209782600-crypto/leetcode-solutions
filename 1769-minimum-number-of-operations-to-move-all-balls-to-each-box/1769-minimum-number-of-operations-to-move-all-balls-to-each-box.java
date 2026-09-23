class Solution {
    public int[] minOperations(String boxes) {
       char [] ch=boxes.toCharArray();
       int [] ans=new int[ch.length];
       for(int i=0;i<ch.length;i++) 
       {
       int count=0;
          for(int j=0;j<ch.length;j++) 
           {
            if(ch[j]=='1')
            {
                count+=Math.abs(j-i);
            }
           }
           ans[i]=count;
       }
       return ans;
    }
}