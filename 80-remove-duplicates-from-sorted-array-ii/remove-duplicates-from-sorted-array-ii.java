class Solution {
    public int removeDuplicates(int[] n) {
        int k=2;
        for(int i=2;i<n.length;i++){
            if(n[i]!=n[k-2]){
                n[k]=n[i];
                k++;
            }
        }
        return k;
    }
}