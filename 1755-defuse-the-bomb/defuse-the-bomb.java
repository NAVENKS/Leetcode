class Solution {
    public int[] decrypt(int[] arr, int k) {
        int ans[]=new int[arr.length];
        if(k==0)return ans;
        for(int i=0;i<arr.length;i++){
            if(k>0){
                int j=i+1;
                int c=0;
                for(int y=0;y<k;y++){
                    if(j>=arr.length)
                    j=0;
                    c+=arr[j++];
                }
                ans[i]=c;
            }
            else{
                int j=i-1;
                int c=0;
                System.out.print(1+" ");
                int t=k*-1;
                for(int y=0;y<t;y++){
                    if(j<0)
                    j=arr.length-1;
                    c+=arr[j--];
                }
                ans[i]=c;
            }
        }
        return ans;
    }
}