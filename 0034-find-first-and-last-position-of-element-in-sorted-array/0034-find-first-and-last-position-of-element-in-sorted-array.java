class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=first(nums,target);
        int l=last(nums,target);
        return new int[]{f,l};
    }
    public static int first(int[] nums,int t){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int m=low+(high-low)/2;
            if(nums[m]==t){
                ans=m;
                high=m-1;
            }
            else if(nums[m]>=t){
                high=m-1;
            }
            else{
                low=m+1;
            }
        }
        return ans;
    }
    public static int last(int[] nums,int t){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int m=low+(high-low)/2;
            if(nums[m]==t){
                ans=m;
            low=m+1;
            }
            else if(nums[m]>=t){
                high=m-1;
            }
            else{
                low=m+1;
            }
        }
        return ans;
    }
}