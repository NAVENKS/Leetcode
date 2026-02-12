class Solution {
    void rev(int []n,int s,int e){
        while(s<e){
            int t=n[s];
            n[s]=n[e];
            n[e]=t;
            s++;
            e--;
        }
    }
    public void rotate(int[] n, int k) {
        k=k%n.length;
        rev(n,0,n.length-1);
        rev(n,0,k-1);
        rev(n,k,n.length-1);
    }
}