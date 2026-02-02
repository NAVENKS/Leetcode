class Solution {
    public int[] sortedSquares(int[] n) {
        for(int i=0;i<n.length;i++){
            n[i]*=n[i];
        }
        Arrays.sort(n);
        return n;
    }
}