class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(n);
        for(int i=0;i<n.length-2;i++){
            int x=n[i];
            if(i>0 && x==n[i-1])continue;
            int j=i+1,k=n.length-1;
            while(j<k){
                int t=n[j]+n[k];
                if(x+t==0){
                    List<Integer>pair=new ArrayList<>();
                    pair.add(x);
                    pair.add(n[j]);
                    pair.add(n[k]);
                    ans.add(pair);
                    j++;
                    k--;
                    while(j<k && n[j]==n[j-1])j++;
                    while(k>=0 && n[k]==n[k+1])k--;
                }
                else if(x+t>0)
                k--;
                else if(x+t<0)
                j++;
            }
        }
        return ans;
    }
}