class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int n=nums.length;
       int sum=0;
       int left=0;
       int min=Integer.MAX_VALUE;
       for(int r=0;r<n;r++){
        sum+=nums[r];
        while(sum>=target){
            int l=r-left+1;
            min=Math.min(min,l);
            sum-=nums[left];
            left++;

        }
       } 
       return min==Integer.MAX_VALUE?0:min;
    }
}