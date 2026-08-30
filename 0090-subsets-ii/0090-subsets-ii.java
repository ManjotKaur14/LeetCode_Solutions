class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();

        generate(nums,0,new ArrayList<>(),ans);

        return ans;
    }
    public static void generate(int[] nums, int i,  List<Integer> current, List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        generate(nums,i+1,current,ans);
        current.remove(current.size()-1);
        int idx=i+1;
        while(idx<nums.length && nums[idx]==nums[idx-1]){
            idx++;
        }
        generate(nums,idx,current,ans);
    }
}