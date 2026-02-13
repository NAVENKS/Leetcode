class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int o[]=new int [n];
        o[n-1]=p[n-1];
        int max=p[n-1];
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,p[i]);
            o[i]=max;
        }
        max=0;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,o[i]-p[i]);
        }
        return max;
    }
}