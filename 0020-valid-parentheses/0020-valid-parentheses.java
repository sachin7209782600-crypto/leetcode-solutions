class Solution {
    public boolean isValid(String s) {
        Stack<Character> wow=new Stack<>();
         wow.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(!wow.isEmpty())
            {
                 char ch=wow.peek(); 
                 if(((ch=='(')&&(s.charAt(i)==')'))||
                 ((ch=='{')&&(s.charAt(i)=='}'))||
                 ((ch=='[')&&(s.charAt(i)==']')))
                 {
                     wow.pop();
                 }
                 else
                 {
                  wow.push(s.charAt(i));
                 }
            }
            else
            {
                  wow.push(s.charAt(i));
            }
        }
        if(wow.isEmpty())
        return true;
        return false;
    }
}