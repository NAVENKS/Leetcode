class Solution {
    public int numIslands(char[][] g) {
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        Stack<int []>stack=new Stack<>();
        int u=1;
        HashMap<Integer,Integer>map=new HashMap<>();
        int m[][]=new int [g.length][g[0].length];
        // for(int i=0;i<m.length;i++)
        // Arrays.fill(m[i],0);
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]=='1'){
                        m[i][j]=u++;
                    stack.push(new int[]{i,j});
                    while(!stack.isEmpty()){
                        int n[]=stack.pop();
                        g[n[0]][n[1]] = '0';
                        for(int in=0;in<dir.length;in++){
                            int wr=n[0]+dir[in][0];
                            int wc=n[1]+dir[in][1];
                            if(wr>=0&&wc>=0&&wr<g.length&&wc<g[0].length&&g[wr][wc]=='1'){
                                    stack.push(new int[]{wr,wc});
                                    m[wr][wc]=m[n[0]][n[1]]; 
                            }
                        }
                    }
                }
            }
        }
        return u-1;
    }
}