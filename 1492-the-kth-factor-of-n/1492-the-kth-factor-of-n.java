class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer>wow=new ArrayList<>();
        int check=1;
        while(check!=n)
        {
         if(n%check==0)
         {
            wow.add(check);
         }
            check++;
        }
        if(n%check==0)
        {
            wow.add(check);
        }
        if(wow.size()>=k)
        {
            return wow.get(k-1);
        }
        return -1;
    }
}