class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=1;
        if(nums.length==0){
            return 0;
        }
        Set<Integer> st=new HashSet<>();
        for(int x:nums){
            st.add(x);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                int c=1;
                int x=it;
                while(st.contains(x+1)){
                    x=x+1;
                    c++;
                }
longest=Math.max(longest,c);
            }

        } 
        return longest;
           }
}