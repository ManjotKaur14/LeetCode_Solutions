class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int c1=0;
        int c2=0;
        int el1=0;
        int el2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!=el2){
                el1=nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i]!=el1){
                el2=nums[i];
                c2=1;
            }
            else if( el1==nums[i]){
                c1++;
            }
            else if(el2==nums[i]){
                c2++;
            }
            else{
                c1--;
                c2--;

            }
        }
        c1=0;
        c2=0;
        for(int x:nums){
            if(x==el1)c1++;
            else if(x==el2)c2++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(c1>nums.length/3){
            ans.add(el1);

        }
        if(c2>nums.length/3){
            ans.add(el2);
        }
       return ans;
        
    }
}