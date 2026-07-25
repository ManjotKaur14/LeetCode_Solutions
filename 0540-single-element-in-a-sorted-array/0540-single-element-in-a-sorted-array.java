class Solution {
    public int singleNonDuplicate(int[] nums) {
        int x=0;
        for(int a:nums)x=x^a;
        return x;
    }
}