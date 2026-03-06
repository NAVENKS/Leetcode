class Solution {
    public int candy(int[] r) {
        int arr[]=new int[r.length];
        Arrays.fill(arr,0);
        for(int i=0;i<r.length;i++){
            if((i-1)>=0 && r[i]>r[i-1]){
                arr[i]+=arr[i-1];
                arr[i]++;
            }
            else
            arr[i]=1;
        }
        // System.out.println(Arrays.toString(arr));
        for(int i=r.length-1;i>=0;i--){
            if((i+1)<r.length && r[i]>r[i+1] && arr[i]<=arr[i+1])
            arr[i]=arr[i+1]+1;
        }
        // System.out.print(Arrays.toString(arr));
        int ans=0;
        for(int i=0;i<r.length;i++)
        ans+=arr[i];
        return ans;
    }
}