class ProductOfNumbers {

    List<Integer> ans=new ArrayList<>();
    public ProductOfNumbers() {}
    
    public void add(int num) {
        ans.add(num);
    }
    
    public int getProduct(int k) {
        int muli=1,n=ans.size();
        for(int i=n-k;i<n;i++)
        {
            muli*=ans.get(i);
        }
        return muli;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */