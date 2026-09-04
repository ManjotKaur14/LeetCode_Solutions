class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        ArrayList<List<Integer>> ans=new ArrayList<>();
        getperms(nums,0,ans);
        return ans;
    }
    
    public static void getperms(int[] nums,int idx,List<List<Integer>> ans){
        if(idx==nums.length){
            ArrayList<Integer> temp= new ArrayList<>();
            for(int x:nums){
                temp.add(x);
                
            }
            ans.add(temp);
        return;}
        for(int i=idx;i<nums.length;i++ ){
            swap(nums,idx,i);
            getperms(nums,idx+1,ans);
              swap(nums,idx,i);
        }
    }
    public static void swap(int[]nums,int a,int b){
        int temp=nums[a];
       nums[a]=nums[b];
       nums[b]=temp;
    }
}