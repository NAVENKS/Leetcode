class Solution {
    public int minSubArrayLen(int t, int[] n) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int r=0;r<n.length;r++){
            sum+=n[r];
            while(sum>=t){
                min=Math.min(min,r-l+1);
                sum-=n[l];
                l++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}