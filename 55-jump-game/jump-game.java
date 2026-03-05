class Solution {
    public boolean canJump(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i>j)return false;
            j=Math.max(j,arr[i]+i);
            if(j>=arr.length)return true;
        }
        return true;
    }
}