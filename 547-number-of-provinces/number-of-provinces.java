class Solution {
    boolean visited[];
    public void dfs(int node,int adj[][]){
        visited[node]=true;
        for(int i=0;i<adj[node].length;i++){
            if(!visited[i] && adj[node][i]==1){
                dfs(i,adj);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        visited=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected);
                ans++;
            }
        }
        return ans;
    }
}