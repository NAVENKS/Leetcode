class Solution {
    public boolean canJump(int[] n) {
        int max=0;
        for(int i=0;i<n.length;i++){
            if(i>max){
                return false;
            }
            max=Math.max(max,i+n[i]);
            if(max>=n.length-1){
                return true;
            }
        }
        return true;
    }
}