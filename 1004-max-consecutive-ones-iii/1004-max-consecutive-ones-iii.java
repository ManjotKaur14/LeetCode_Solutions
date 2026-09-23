class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=0;
         int l=0;
         int z=0;
         for(int i=0;i<n;i++){
            if(nums[i]==0){
                z++;
            }
            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;

            }
            max=Math.max(max,i-l+1);
         }

 return max;
    }
}