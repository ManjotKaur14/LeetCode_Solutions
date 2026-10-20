class Solution {
    public int compress(char[] chars) {
           int idx=0;
           for(int i=0;i<chars.length;i++){
            int count=0;
            char ch=chars[i];
            while( i<chars.length && chars[i]==ch ){
                count++;
                i++;
            }
           
             chars[idx++]=ch;
        
      if(count>1){
            
            String s=String.valueOf(count);
            for(char d:s.toCharArray()){
                chars[idx++]=d;
            
           }
      }
           i--;
           }
           return idx;
            
    }
}