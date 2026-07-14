class Solution {
    public List<List<Integer>> generate(int numRows) {
          List<List<Integer>> l=new ArrayList<>();
          for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            long ans=1;
            temp.add(1);
            for(int j=1;j<=i;j++){
                ans=ans*(i-j+1);
                ans=ans/j;
                temp.add((int)ans);
            }
            l.add(temp);
            
          }
          return l;
    }
}