class Solution {
    public int arrayPairSum(int[] n) {
        Arrays.sort(n);
        int ans=0;
        for(int i=0;i<n.length;i+=2){
            ans+=Math.min(n[i],n[i+1]);
        }
        return ans;
    }
}