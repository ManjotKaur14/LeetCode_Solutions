class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int x=0;
        for(int i=1;i<=n;i++){
            x^=i;
        }
        for(int v:nums){
            x^=v;
        }
        return x;
    }
}