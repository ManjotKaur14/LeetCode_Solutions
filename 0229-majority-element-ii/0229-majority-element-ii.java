class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int el1=0;
        int el2=0;
        for(int x:nums){
            if(c1==0 && x!=el2){
                c1=1;
                el1=x;
            }
            else if(c2==0 && x!=el1){
                c2=1;
                el2=x;
            }
            else if(el1==x) c1++;
            else if(el2==x) c2++;
            else{
                c1--;
                c2--;
            }

        }
        c1=0;
        c2=0;
        for(int n:nums){
            if(el1==n)c1++;
            else if(el2==n)c2++;
        }
           List <Integer> l=new ArrayList<>();
           if(c1>nums.length/3){
            l.add(el1);
           }
            if(c2>nums.length/3){
            l.add(el2);
           }
           return l;
    }
}