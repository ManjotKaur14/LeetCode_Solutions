class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int a=haystack.indexOf(needle);
            return a;
        }
        return -1;
    }

}