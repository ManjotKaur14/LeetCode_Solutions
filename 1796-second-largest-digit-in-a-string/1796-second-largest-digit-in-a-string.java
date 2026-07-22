class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int sMax=-1;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isDigit(c)){
            int ch=c- '0';
            if(ch>max){
                sMax=max;
                max=ch;
            }
            else if(ch>sMax && ch!=max){
                sMax=ch;
            }
        }
       }
       return sMax;
    }
}