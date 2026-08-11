class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int msum=Integer.MIN_VALUE;
        for(int x:nums){
            sum+=x;
            msum=Math.max(msum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return msum;
    }
}