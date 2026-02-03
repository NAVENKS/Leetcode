class Solution {
    public int[] sortArrayByParity(int[] n) {
        int ans[]=new int[n.length];
        int j=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0)
            ans[j++]=n[i];
        }
        for(int i=0;i<n.length;i++){
            if(n[i]%2!=0)
            ans[j++]=n[i];
        }
        return ans;
    }
}