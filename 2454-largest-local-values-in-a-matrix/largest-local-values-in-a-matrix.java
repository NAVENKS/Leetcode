class Solution {
    public int[][] largestLocal(int[][] arr) {
        int ans[][]=new int [arr.length-2][arr.length-2];
        Queue<Integer> max = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j+3<=arr.length && i+3<=arr.length){
                    int m=Integer.MIN_VALUE;
                    for(int k=i;k<(i+3);k++){
                        for(int l=j;l<(j+3);l++){
                            m=Math.max(m,arr[k][l]);
                        }
                    }
                    max.offer(m);
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                if(!max.isEmpty())
                ans[i][j]=max.poll();
            }
        }
        return ans;
    }
}