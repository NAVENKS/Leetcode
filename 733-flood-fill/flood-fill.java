class Solution {
    public int[][] floodFill(int[][] arr, int r, int c, int t) {
        if(arr[r][c]==t)return arr;
        int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
        Queue<int []>que = new LinkedList<>();
        que.offer(new int[]{r,c});
        int q=arr[r][c];
        arr[r][c]=t;
        while(!que.isEmpty())
        {
            int n[]=que.poll();
            for(int d[]:dir){
                int i=n[0]+d[0];
                int j=n[1]+d[1];
                if(i>=0 && j>=0 && i<arr.length && j<arr[0].length && arr[i][j]==q){
                    arr[i][j]=t;
                    que.offer(new int []{i,j});
                }
            }   
        }
        return arr;
    }
}