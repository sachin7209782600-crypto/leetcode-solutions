class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String aam="",lam="",abm="",lbm="",aad="",lad="",abd="",lbd="";
            aam+=""+arriveAlice.charAt(0)+arriveAlice.charAt(1);
            lam+=""+leaveAlice.charAt(0)+leaveAlice.charAt(1);
            abm+=""+arriveBob.charAt(0)+arriveBob.charAt(1);
            lbm+=""+leaveBob.charAt(0)+leaveBob.charAt(1);
            aad+=""+arriveAlice.charAt(3)+arriveAlice.charAt(4);
            lad+=""+leaveAlice.charAt(3)+leaveAlice.charAt(4);
            abd+=""+arriveBob.charAt(3)+arriveBob.charAt(4);
            lbd+=""+leaveBob.charAt(3)+leaveBob.charAt(4);
           int a1m=Integer.parseInt(aam);
           int a2m=Integer.parseInt(lam);
           int b1m=Integer.parseInt(abm);
           int b2m=Integer.parseInt(lbm);
           int a1d=Integer.parseInt(aad);
           int a2d=Integer.parseInt(lad);
           int b1d=Integer.parseInt(abd);
           int b2d=Integer.parseInt(lbd);
           int count=0;
           boolean Alicecome=false;
           boolean Bobcome=false;
           boolean Aliceleave=false;
           boolean Bobleave=false;
           int [] month={0,31,28,31,30,31,30,31,31,30,31,30,31};
             for(int i=1;i<13;i++)
             {
                 for(int j=1;j<=month[i];j++)
                {
                    if(a1m==i&&a1d==j)
                    {
                    Alicecome=true;
                    }
                    if(b1m==i&&b1d==j)
                    {
                    Bobcome=true;
                    }
                    if(a2m==i&&a2d==j)
                    {
                    Aliceleave=true;
                    }
                    if(b2m==i&&b2d==j)
                    {
                    Bobleave=true;
                    }
                    if(Alicecome&&Bobcome)
                    {
                    count++;
                    }
                    if(Aliceleave)
                    {
                        Alicecome=false;
                    }
                    if(Bobleave)
                    {
                        Bobcome=false;
                    }
                }
           }
        return count;
    }
}