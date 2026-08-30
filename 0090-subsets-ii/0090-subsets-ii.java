class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();

        generate(nums,0,new ArrayList<>(),ans);

        return ans;
    }
    public static void generate(int[] nums, int i,  List<Integer> current, List<List<Integer>> ans){
        ans.add(new ArrayList<>(current));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]){
                continue;
            }
            current.add(nums[j]);
            generate(nums,j+1,current,ans);
            current.remove(current.size()-1);
                    }

    }
}