class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> wow=new HashMap<>();
        while(n!=0)
        {
           if(wow.containsKey(n%10))
           {
            wow.put(n%10,wow.get(n%10)+1);
           }
           else
           {
            wow.put(n%10,1);
           }
           n/=10;
        }
        int sum=0;
        for(int i:wow.keySet())
        {
            sum+=(i*wow.get(i));
        }
        return sum;
    }
}