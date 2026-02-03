class Solution {
    public int[] sortArrayByParity(int[] n) {
        int j=0;
        for(int i=1;i<n.length;i++){
            if(n[j]%2==0)j++;
            else if(n[i]%2==0){
                int t=n[j];
                n[j]=n[i];
                n[i]=t;
                j++;
            }
        }
        return n;
    }
}