class Solution {
    public int[] productExceptSelf(int[] n) {
        int p[]=new int[n.length];
        int s[]=new int[n.length];
        int a[]=new int[n.length];
        int sum=1;
        for(int i=0;i<n.length;i++){
            p[i]=sum;
            sum*=n[i];
        }
        sum=1;
        for(int i=n.length-1;i>=0;i--){
            s[i]=sum;
            sum*=n[i];
        }
        for(int i=0;i<n.length;i++){
            a[i]=(p[i]*s[i]);
        }
        return a;
    }
}