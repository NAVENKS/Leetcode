class Solution {
    public int[] sortedSquares(int[] n) {
        int ans[]=new int [n.length];
        int p=0;
        for(int i=0;i<n.length;i++){
            if(n[i]<0){
                p=i;
                n[i]*=n[i];
            }
            else{
                n[i]*=n[i];
            }
        }
        int e=p+1;
        int i=0;
        while(p>=0 && e<n.length){
            if(n[e]<n[p]){
                ans[i++]=n[e++];
            }
            else
                ans[i++]=n[p--];
        }
        while(p>=0)
            ans[i++]=n[p--];
        while(e<n.length)
            ans[i++]=n[e++];
        return ans;
    }
}