class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l=new ArrayList<>();
        int n=rowIndex;
        long ans=1;
        l.add(1);
        for(int i=1;i<=n;i++){
            ans=ans*(n-i+1);
            ans=ans/i;
            l.add((int)ans);
        }
        return l;
    }
}