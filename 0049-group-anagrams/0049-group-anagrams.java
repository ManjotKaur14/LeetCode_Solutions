class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
         List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
       
        char[] ch=strs[i].toCharArray();
        Arrays.sort(ch);
        String s=new String(ch);
       map.putIfAbsent(s,new ArrayList<>());
       map.get(s).add(strs[i]);

                }
                  

        ans.addAll(map.values());

                return ans;

    }
    
}