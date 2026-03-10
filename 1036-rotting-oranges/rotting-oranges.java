class Solution {
    public int orangesRotting(int[][] arr) {
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        Queue<int []>que = new LinkedList<>();
        int fresh=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1)fresh++;
                else if(arr[i][j]==2){
                    que.offer(new int[]{i,j});
                    arr[i][j]=0;
                }
            }
        }
        int min=0;
        while(!que.isEmpty() && fresh>0){
            int size=que.size();
            for(int i=0;i<size;i++){
                int p[] = que.poll();
                for(int d[]:dir){
                    int r = d[0]+p[0];
                    int c = d[1]+p[1];
                    if(r<arr.length && r>=0 && c<arr[0].length && c>=0 && arr[r][c]==1){
                        arr[r][c]=0;
                        que.offer(new int[]{r,c});
                        fresh--;
                    }
                }
            }
            min++;
        }
        if(fresh>0)return -1;
        return min;
    }
}