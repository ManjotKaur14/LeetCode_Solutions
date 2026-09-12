class Solution {
    public int missingNumber(int[] nums) {
       int a=0;
       for(int i=0;i<=nums.length;i++){
        a^=i;

       }
       for(int x: nums){
        a^=x;
       }
       return a;
    }
}