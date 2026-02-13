class Solution {
    public int[][] merge(int[][] n) {
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
            System.out.println(j);
            l.add(new int[]{n[i][0],z});
            if(i==j)
            i++;
            else
            i=j;
        }
        int ans[][]=new int[l.size()][2];
        for(int k=0;k<l.size();k++){
            ans[k]=l.get(k);
        }
        return ans;
    }
}