class Solution {
    public int[][] generateMatrix(int s) {
        int top=0,left=0;
        int n[][]=new int[s][s];
        int a=1;
        int right=n[0].length-1,bottom=n.length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                n[top][i]=a++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                n[i][right]=a++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    n[bottom][i]=a++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    n[i][left]=a++;
                }
                left++;
            }
        }
        return n;
    }
}