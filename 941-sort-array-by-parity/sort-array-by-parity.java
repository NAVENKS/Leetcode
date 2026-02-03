class Solution {
    public int[] sortArrayByParity(int[] n) {
        int ans[]=new int[n.length];
        int j=0;
        // for(int i=0;i<n.length;i++){
        //     if(n[i]%2!=0){
        //         j=i;
        //         break;
        //     }
        // }
        for(int i=1;i<n.length;i++){
            if(n[j]%2==0)j++;
            if(n[j]%2!=0 && n[i]%2==0){
                int t=n[j];
                n[j]=n[i];
                n[i]=t;
                j++;
            }
        }
        return n;
    }
}