class Solution {
    public int numIslands(char[][] arr) {
        int u=0;
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='1'){
                Queue<int []> que = new LinkedList<>();
                    u++;
                    que.offer(new int[]{i,j});
                    arr[i][j]='0';
                    while(!que.isEmpty()){
                        int n[]=que.poll();
                        for(int d[]:dir){
                            int r=n[0]+d[0];
                            int c=n[1]+d[1];
                            if(r>=0 && c>=0 && r<arr.length && c<arr[0].length && arr[r][c]=='1'){
                                que.offer(new int[]{r,c});
                                arr[r][c]='0';
                            }
                        }
                    }
                }
            }
        }
        return u;
    }
}