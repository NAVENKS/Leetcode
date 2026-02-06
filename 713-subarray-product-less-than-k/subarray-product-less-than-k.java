class Solution {
    public int numSubarrayProductLessThanK(int[] n, int k) {
        int j=0;
        int ans=0;
        for(int i=0;i<n.length;i++){
            int p=n[i];
            if(p<k)ans++;
            for(j=i+1;j<n.length;j++){
                p*=n[j];
                if(p>=k)
                break;
                else
                ans++;
            }
        }
        return ans;
    }
}