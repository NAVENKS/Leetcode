class Solution {
    public void gameOfLife(int[][] b) {
        int dr[][]={{1,0},{-1,0},{0,1},{0,-1},{-1,1},{-1,-1},{1,1},{1,-1}};
        int ans[][]=new int[b.length][b[0].length];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                int count=0;
                for(int n[]:dr){
                    int r=n[0]+i;
                    int c=n[1]+j;
                    if(c>=0 && c<b[0].length && r>=0 && r<b.length && b[r][c]==1)
                    count++;
                }
                if(b[i][j]==1 && count<2)
                ans[i][j]=0;
                else if(b[i][j]==1 && count>3)
                ans[i][j]=0;
                else if(b[i][j]==0 && count==3)
                ans[i][j]=1;
                else
                ans[i][j]=b[i][j];
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j]=ans[i][j];
            }
        }
    }
}