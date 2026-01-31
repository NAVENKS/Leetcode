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
        Queue<Pair>q=new LinkedList<>();
        int not=0,count=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==1)
                not++;
                else if(g[i][j]==2){
                    q.offer(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty() && not > 0){
            int s=q.size();
            count++;
            for(int i=0;i<s;i++){
                Pair poll=q.poll();
                int a=poll.a;
                int b=poll.b;
                for(int j=0;j<4;j++)
                {if(a+drow[j]>=0 && a+drow[j]<r && b+dcol[j]>=0 && b+dcol[j]<c && g[a+drow[j]][b+dcol[j]]==1){
                    q.offer(new Pair(a+drow[j],b+dcol[j]));
                    g[a+drow[j]][b+dcol[j]]=2;
                    not--;
                }}
            }
        }
        // if(count==0 && not==0 && g.length==1)
        // return 0;
        return not==0?count:-1;
    }
}


// class Solution {
//     public int orangesRotting(int[][] grid) {
       
//         int m = grid.length;
//         int n = grid[0].length;

//         Queue<int[]> q = new LinkedList<>();
//         int fresh = 0;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (grid[i][j] == 1)
//                     fresh++;
//                 else if (grid[i][j] == 2)
//                     q.offer(new int[]{i, j});
//             }
//         }

//         int time = 0;

//         while (!q.isEmpty() && fresh > 0) {
//             int size = q.size();

//             for (int i = 0; i < size; i++) {
//                 int[] cur = q.poll();
//                 int r = cur[0];
//                 int c = cur[1];

//                 // Right
//                 if (c + 1 < n && grid[r][c + 1] == 1) {
//                     grid[r][c + 1] = 2;
//                     fresh--;
//                     q.offer(new int[]{r, c + 1});
//                 }

//                 // Down
//                 if (r + 1 < m && grid[r + 1][c] == 1) {
//                     grid[r + 1][c] = 2;
//                     fresh--;
//                     q.offer(new int[]{r + 1, c});
//                 }

//                 // Left
//                 if (c - 1 >= 0 && grid[r][c - 1] == 1) {
//                     grid[r][c - 1] = 2;
//                     fresh--;
//                     q.offer(new int[]{r, c - 1});
//                 }

//                 // Up
//                 if (r - 1 >= 0 && grid[r - 1][c] == 1) {
//                     grid[r - 1][c] = 2;
//                     fresh--;
//                     q.offer(new int[]{r - 1, c});
//                 }
//             }

//             time++; 
//         }

//         return fresh == 0 ? time : -1;
//     }
// }