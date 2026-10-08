class Solution {
    public String removeOuterParentheses(String s) {
       StringBuffer so=new StringBuffer();
       int first=1,last=0;
       for(int i=1;i<s.length();i++)
       {
        if(s.charAt(i)=='(')
        {
            first++;
        }
        else
        {
            last++;
        }
        if(first!=last)
        {
            so.append(s.charAt(i));
        }
        else
        {
            i++;
            first=1;
            last=0;
        }
       }    
       return so.toString();
    }
}