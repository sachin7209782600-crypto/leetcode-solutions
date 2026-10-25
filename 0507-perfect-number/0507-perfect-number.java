class Solution {
    public boolean checkPerfectNumber(int num) {
        int val=num,ck=1,sum=0;
        while(val!=1)
        {
         if(num%ck==0)
         {
          sum+=ck;
         }
         ck++;
         val--;
        }
        if(sum==num)
        {
            return true;
        }
        return false;
    }
}