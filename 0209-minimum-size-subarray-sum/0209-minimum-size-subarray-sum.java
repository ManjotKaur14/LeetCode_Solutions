class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int sum=0;
        int l=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>=target){
                int len=r-l+1;
                min=Math.min(min,len);
                sum-=nums[l];
                l++;
            }
        }
  
         return min == Integer.MAX_VALUE ? 0 : min;
    }
}