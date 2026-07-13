class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int el=0;
        for(int x: nums){
            if(count==0){
                count=1;
                el=x;
            }
            else if(x==el){
                count++;

            }
            else{
                count--;
            }
        }
        return el;
    }
}