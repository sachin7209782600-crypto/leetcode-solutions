class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>wow=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int val=i,count=0;
            while(val!=0)
            {
                int rem=val%10;
                if(rem==0||i%rem!=0)
                {
                    count++;
                    break;
                }
                    val/=10;
            }
            if(count==0)
            {
                wow.add(i);
            }
        }
        return wow;
    }
}