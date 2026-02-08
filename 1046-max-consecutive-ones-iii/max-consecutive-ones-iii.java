class Solution {
    public int longestOnes(int[] n, int k) {
        int j=0;
        int max=0;
        int t=0;
        for(int i=0;i<n.length;i++){
            if(n[i]==0)
            t++;
            while(t>k){
                if(n[j]==0)
                t--;
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}