class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int k=nums.length-1;
        for(int i=0;i<nums.length;i++){
            int a=nums[left]*nums[left];
            int b=nums[right]*nums[right];
            if(a>b){
                ans[k]=a;
                k--;
                left++;

            }
            else{
                ans[k]=b;
                k--;
                right--;
            }

        }
        return ans;
    }
}