class Solution {
    public int[][] insert(int[][] arr, int[] ne) {
        int n[][]=new int[arr.length+1][2];
        int k=0;
        int in=0;
        for(in =0 ;in<arr.length;in++)
        n[in]=arr[in];
        n[in]=ne;
        Arrays.sort(n,(a,b)->a[0]-b[0]);
        List<int []>l=new ArrayList<>();
        int i=0;
        while(i<n.length){
            int j=i+1;
            int z=n[i][1];
            while(j<n.length && z>=n[j][0]){
                z=Math.max(z,n[j][1]);
                j++;
            }
            l.add(new int[]{n[i][0],z});
            if(i==j)
            i++;
            else
            i=j;
        }
        int ans[][]=new int[l.size()][2];
        for(int b=0;b<l.size();b++){
            ans[b]=l.get(b);
        }
        return ans;
    }
}