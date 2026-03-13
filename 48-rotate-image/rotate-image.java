class Solution {
    public void rotate(int[][] n) {
        int r=n.length,c=n[0].length;
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int t=n[i][j];
                n[i][j]=n[j][i];
                n[j][i]=t;
            }
        }
        for(int i=0;i<r;i++){
            int s=0,e=c-1;
            while(s<=e){
                int t=n[i][s];
                n[i][s]=n[i][e];
                n[i][e]=t;
                s++;
                e--;
            }
        }
    }
}