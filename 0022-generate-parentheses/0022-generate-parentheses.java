class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> wow=new ArrayList();
        form("",0,0,n,wow);
        return wow;
     } 

     public void form(String s,int open,int close,int p,List<String> wow)
     {
        if(s.length()==2*p)
        {
            wow.add(s);
            return;
        }
        if(open<p)
        {
            form(s+"(",open+1,close,p,wow);
        }
        if(close<open)
        {
            form(s+")",open,close+1,p,wow);
        }
    }
}