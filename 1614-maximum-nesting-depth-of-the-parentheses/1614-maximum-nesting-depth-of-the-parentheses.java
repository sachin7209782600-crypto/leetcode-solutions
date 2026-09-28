class Solution {
    public int maxDepth(String s) {
        int maxi=0,val=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
             val++;
            if(s.charAt(i)==')')
             val--;
             maxi=Math.max(maxi,val);
        }
        return maxi;
    }
}