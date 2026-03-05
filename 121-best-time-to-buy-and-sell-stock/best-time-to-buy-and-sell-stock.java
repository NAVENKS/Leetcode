class Solution {
    public int maxProfit(int[] p) {
        int suf[]=new int [p.length];
        int max=Integer.MIN_VALUE;
        for(int i=p.length-1;i>=0;i--){
            max=Math.max(max,p[i]);
            suf[i]=max;
        }
        max=0;
        for(int i=0;i<p.length;i++){
            max=Math.max(max,suf[i]-p[i]);
        }
        return max;
    }
}