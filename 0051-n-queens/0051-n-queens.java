class Solution {
    public List<List<String>> solveNQueens(int n) {
      char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> ans=new ArrayList<>();
        nQueens(board,0,n,ans);
        return ans;
    }
    public static void nQueens(char[][] board,int row,int n,List<List<String>> ans){
        if(row==n){
            List<String> temp = new ArrayList<>();

for (int i = 0; i < n; i++) {
    temp.add(new String(board[i]));
}

ans.add(temp);
return;
        }
        for(int j=0;j<n;j++){
        if(isSafe(board,row,j,n)){
            board[row][j]='Q';
            nQueens(board,row+1,n,ans);
            board[row][j]='.';
        }
        }  
          }
          public static boolean isSafe(char[][] board ,int r,int c,int n){
            for(int j=0;j<n;j++){
                if(board[r][j]=='Q')return false;
            }
             for(int i=0;i<n;i++){
                if(board[i][c]=='Q')return false;
            }
            for(int i=r,j=c;i>=0 &&j>=0;i--,j--){
                if(board[i][j]=='Q')return false;
            }
            for(int i=r,j=c;i>=0 &&j<n;i--,j++){
                if(board[i][j]=='Q')return false;
            }
            return true;
          }
}