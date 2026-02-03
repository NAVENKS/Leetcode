class Solution {
    public int removeDuplicates(int[] n) {
        int i=0;
        for(int j=0;j<n.length;j++){
            if(n[i]!=n[j]){
                i++;
                n[i]=n[j];
            }
        }
        return i+1;
    }
}