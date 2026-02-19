class Solution {
    public List<Integer> findDisappearedNumbers(int[] n) {
        int i=0;
        List<Integer>ans=new ArrayList<>();
        while(i<n.length){
            while(n[i]!=i+1){
                if(n[n[i]-1]==n[i]){
                    break;
                }
                int t=n[n[i]-1];
                n[n[i]-1]=n[i];
                n[i]=t;
            }
            i++;
        }
        for(i=0;i<n.length;i++){
            if(n[i]!=i+1)
            ans.add(i+1);
        }
        return ans;
    }
}