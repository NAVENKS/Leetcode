class Solution {
    public List<List<Integer>> fourSum(int[] n, int t) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(n);
        for(int s=0;s<=n.length-3;s++){
        if(s>0 && n[s]==n[s-1])continue;
        for(int i=s+1;i<n.length;i++){
            int x=n[i];
            if(i>s+1 && n[i]==n[i-1])continue;
            int j=i+1,k=n.length-1;
            while(j<k){
                long sum=n[j]+n[k];
                if((x+sum+n[s])==t){
                    ans.add(Arrays.asList(n[s],x,n[j],n[k]));
                    j++;
                    k--;
                    while(j<k && n[j]==n[j-1])j++;
                    while(j<k && n[k]==n[k+1])k--;
                }
                else if((x+sum+n[s])>t)
                k--;
                else if((x+sum+n[s])<t)
                j++;
            }
        }}
        return ans;
    }
}