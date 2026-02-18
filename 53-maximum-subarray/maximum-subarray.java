class Solution {
    public int maxSubArray(int[] n) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            sum+=n[i];
            max=Math.max(max,sum);
            if(sum<0)
            sum=0;
        }
        return max;
    }
}