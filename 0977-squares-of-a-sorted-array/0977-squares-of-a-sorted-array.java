class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;

        int l=0;
        int r=n-1;
        int[] ans=new int[n];
        int k=n-1;

        for(int i=0;i<n;i++){
            int l1=nums[l]*nums[l];
            int r1=nums[r]*nums[r];
            if(l1>r1){
                ans[k]=l1;
                l++;
                k--;
            }
            else{
                ans[k]=r1;
                r--;
                k--;
            }
        }
        return ans;
    }
}