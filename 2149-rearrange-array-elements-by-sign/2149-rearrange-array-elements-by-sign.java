class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int p=0;
        int e=1;
        for(int x:nums){
            if(x<0){
            ans[e]=x;
            e+=2;
            }
            else{
                ans[p]=x;
                p+=2;
            }
        }
        return ans;
    }
}