class Solution {
    List<List<String>>ans=new ArrayList<>();
    public boolean check(int row,int col,char [][]board,int n){
        int i=row,j=col;
        while(i>=0){
            if(board[i][col]=='Q')return false;
            i--;
        }
        i=row;
        while(i<n){
            if(board[i][col]=='Q')return false;
            i++;
        }
        i=row;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }
        return true;
    }
    public void queens(int row,int col,int n,int queens,char [][]board){
        if(queens==n){
            List<String>list = new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder str = new StringBuilder();
                for(int j=0;j<n;j++){
                    str.append(board[i][j]);
                }
                list.add(str.toString());
            }
            ans.add(new ArrayList<>(list));
        }
        if(row>=n)return;
        for(;col<n;col++){
            if(check(row,col,board,n)){
                board[row][col]='Q';
                queens(row+1,0,n,queens+1,board);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++)
        Arrays.fill(board[i],'.');
        queens(0,0,n,0,board);
        return ans;
    }
}