class Solution {
    public int maxSubArray(int[] nums) {
   int s=0;
   int m=Integer.MIN_VALUE;
   for(int v:nums){
    s+=v;
    m=Math.max(m,s);
    if(s<0){
        s=0;
    }
   }
return m;
    }
}