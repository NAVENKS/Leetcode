class Pair{
    int a,b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class Solution {
    public int numEnclaves(int[][] g) {
        Queue<Pair>q=new LinkedList<>();
        int r=g.length;
        int c=g[0].length;
        int drow[]={-1,0, 1, 0};
        int dcol[]={ 0,1, 0,-1};
        int land=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(g[i][j]==1){
                    land++;
                    if(i==0 || j==0 || j==c-1 || i==r-1){
                        q.offer(new Pair(i,j));
                        g[i][j]=0;
                        land--;
                    }
                }
            }
        }
        while(!q.isEmpty() && land>0){
            int s=q.size();
            for(int i=0;i<s;i++){
                Pair poll=q.poll();
                int a=poll.a;
                int b=poll.b;
                for(int j=0;j<4;j++)
                {if(a+drow[j]>=0 && a+drow[j]<r && b+dcol[j]>=0 && b+dcol[j]<c && g[a+drow[j]][b+dcol[j]]==1){
                    q.offer(new Pair(a+drow[j],b+dcol[j]));
                    g[a+drow[j]][b+dcol[j]]=2;
                    land--;
                }}
            }
        }
        return land;
    }
}