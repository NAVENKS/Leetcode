class Solution {
    public List<Integer> spiralOrder(int[][] n) {
        int top=0,left=0;
        int right=n[0].length-1,bottom=n.length-1;
        List<Integer>ans=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans.add(n[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(n[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(n[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(n[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}