class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<Integer> list[] = new ArrayList[isConnected.length];
        for(int i=0;i<isConnected.length;i++)
        list[i]=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(i!=j && isConnected[i][j]==1){
                    list[i].add(j);
                }
            }
        }
        boolean vis[] = new boolean[isConnected.length];
        int ans=0;
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==true)continue;
            Stack<Integer>stack=new Stack<>();
            stack.push(i);
            if(vis[i]==false){
                ans++;
                while(!stack.isEmpty()){
                    int j=stack.pop();
                    vis[j]=true;
                    for(int k:list[j]){
                        if(vis[k]==false)
                        stack.push(k);
                        vis[k]=true;
                    }
                }
            }
        } 
        return ans;
    }
}