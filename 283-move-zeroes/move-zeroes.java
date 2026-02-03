class Solution {
    public void moveZeroes(int[] n) {
        int s=-1;
        for(int i=0;i<n.length;i++){
            if(n[i]==0){
                s=i;
                break;
            }
        }
        if(s==-1)return;
        int j=s+1;
        while(j<n.length){
            if(n[j]!=0){
                n[s]=n[j];
                n[j]=0;
                s++;
            }
            j++;
        }
    }
}