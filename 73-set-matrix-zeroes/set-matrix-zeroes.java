class Solution {
    public void setZeroes(int[][] n) {
        int r=n.length;
        int c=n[0].length;
        List<int []>z=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(n[i][j]==0){
                    z.add(new int[]{i,j});
                }
            }
        }
        for(int i=0;i<z.size();i++){
            int in[]=z.get(i);
            for(int j=0;j<r;j++){
                n[j][in[1]]=0;
            }
            for(int j=0;j<c;j++){
                n[in[0]][j]=0;
            }
        }
    }
}