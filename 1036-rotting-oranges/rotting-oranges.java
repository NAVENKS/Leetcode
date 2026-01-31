class Pair{
    int a,b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class Solution {
    public int orangesRotting(int[][] g) {
        int drow[]={-1,0, 1, 0};
        int dcol[]={ 0,1, 0,-1};
        int r=g.length,c=g[0].length;
        int vis[][]=new int [r][c];
        Queue<Pair>q=new LinkedList<>();
        int not=0,count=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==1)
                not++;
                else if(g[i][j]==2){
                    q.offer(new Pair(i,j));
                    vis[i][j]=1;
                }
            }
        }
        while(!q.isEmpty()){
            int s=q.size();
            count++;
            for(int i=0;i<s;i++){
                Pair poll=q.poll();
                int a=poll.a;
                int b=poll.b;
                for(int j=0;j<4;j++)
                {if(a+drow[j]>=0 && a+drow[j]<r && b+dcol[j]>=0 && b+dcol[j]<c && g[a+drow[j]][b+dcol[j]]==1 && vis[a+drow[j]][b+dcol[j]]==0){
                    q.offer(new Pair(a+drow[j],b+dcol[j]));
                    vis[a+drow[j]][b+dcol[j]]=1;
                    not--;
                }}
                // if(a-1>=0 && g[a-1][b]==1 && vis[a-1][b]==0){
                //     q.offer(new Pair(a-1,b));
                //     vis[a-1][b]=1;
                //     not--;
                // }
                // if(a+1<r && g[a+1][b]==1 && vis[a+1][b]==0){
                //     q.offer(new Pair(a+1,b));
                //     vis[a+1][b]=1;
                //     not--;
                // }
                // if(b-1>=0 && g[a][b-1]==1 && vis[a][b-1]==0){
                //     q.offer(new Pair(a,b-1));
                //     vis[a][b-1]=1;
                //     not--;
                // }
                // if(b+1<c && g[a][b+1]==1 && vis[a][b+1]==0){
                //     q.offer(new Pair(a,b+1));
                //     vis[a][b+1]=1;
                //     not--;
                // }
            }
        }
        if(count==0 && not==0 && g.length==1)
        return 0;
        System.out.print(g.length+" "+not+" "+count);
        return not==0?count-1:-1;
    }
}