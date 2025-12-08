class Solution {
    int dir[][]={{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2}};
    boolean fun(int m[][],int r,int c){
        int wr=r,wc=c;
        if(m[r][c]==m.length*m.length-1)return true;
        for(int i=0;i<dir.length;i++){
            int cr=r+dir[i][0];
            int cc=c+dir[i][1];
            if(cc>=0&&cr>=0&&cc<m.length&&cr<m.length&&m[r][c]+1==m[cr][cc]){
                boolean res=fun(m,cr,cc);
                return res;
            }
        }
        return false;
    }
    public boolean checkValidGrid(int[][] m) {
        if(m[0][0]!=0)return false;
        return fun(m,0,0);
    }
}