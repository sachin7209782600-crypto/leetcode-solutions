class Solution {
    public int countVowelStrings(int n) {
        if(n==1)
        {
            return 5;
        }
        // if(n==2)
        // {
        //     return 5+4+3+2+1;
        // }
        // if(n==3)
        // {
        //     return 5*15 + 4*10 + 3*6 +2*3 +1*1;
        // }
        // if(n==4)
        // {
        //     return 5*140  +4*65 +3*25 +2*7 +1*1;
        // }
        int vow[]={5,4,3,2,1};
        for(int i=2;i<n;i++)
        {
        int sum=0;
        for(int j=4;0<=j;j--)
        {
        sum+=vow[j];
        vow[j]=sum;
        }
        }
        return vow[4]+vow[3]+vow[2]+vow[1]+vow[0];
    }
}