class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length;
       if(n==0)return 0;
       int l=1;
       Set<Integer> s=new HashSet<>();
       for(int i=0;i<n;i++)s.add(nums[i]);
       for(int i:s){
        if(!s.contains(i-1)){
            int count=1;
            int x=i;
        
        while(s.contains(x+1)){
            x=x+1;
            count++;
        }
        l=Math.max(l,count);
       }
       }
        return l;
    }
}