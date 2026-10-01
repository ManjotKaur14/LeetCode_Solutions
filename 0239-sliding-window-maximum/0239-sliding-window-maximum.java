class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque();
        int[] ans= new int[n-k+1];
        for(int i=0;i<k;i++){
            while(dq.size()>0 && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
  int idx=0;
        for(int i=k;i<n;i++){
           ans[idx++]=nums[dq.peekFirst()];
            while(dq.size()>0 && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(dq.size()>0 && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
     dq.offerLast(i);
        }
        ans[idx]=nums[dq.peekFirst()];
   return ans;
    }
}