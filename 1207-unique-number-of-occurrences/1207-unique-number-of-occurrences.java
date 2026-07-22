class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<arr.length;i++){
            int c=arr[i];
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
         }
         Set<Integer> set=new HashSet<>();
         for(int x:map.values()){
            if(set.contains(x)){
                return false;
            }
            set.add(x);
         }
         return true;
    }
}