class Solution {
    public int[] findDiagonalOrder(int[][] m) {
        int ans[]=new int[m.length*m[0].length];
        int r=m.length,c=m[0].length;
        int i=0,j=0,u=1,in=0;
        boolean s=true;
        while(s){
            if(i>=r){
                i=r-1;
                j++; 
            }
            int t=i;
            int k=j;
            int start=in;
            while(t>=0 && k<c){
                ans[in++]=m[t][k];
                if(t==r-1 && k==c-1)s=false;
                k++;
                t--;
            }
            i++;
            if(u%2==0){
                int end = in-1;
                while(start<=end){
                    int tem=ans[start];
                    ans[start]=ans[end];
                    ans[end]=tem;
                    start++;
                    end--;
                }
            }
            u++;
        }
        return ans;
    }
}