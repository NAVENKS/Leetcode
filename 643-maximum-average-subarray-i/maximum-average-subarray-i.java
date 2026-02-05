class Solution {
    public double findMaxAverage(int[] n, int k) {
        double max=Integer.MIN_VALUE;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=n[i];
        }
        max=Math.max((sum/k),max);
        int j=k,i=0;
        while(j<n.length){
            sum-=n[i++];
            sum+=n[j++];
            max=Math.max((sum/k),max);
        }
        return max;
    }
}