class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        generate(nums,0,current,ans);
        return ans;
    }
   public static void  generate(int[] nums,int i,List<Integer> current,List<List<Integer>> ans){
    if(i==nums.length){
        ans.add(new ArrayList<>(current));
        return;
    }
    current.add(nums[i]);
    generate(nums,i+1,current,ans);
    current.remove(current.size()-1);
    generate(nums,i+1,current,ans);

   }

}