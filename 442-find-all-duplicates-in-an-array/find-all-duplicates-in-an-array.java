class Solution {
    public List<Integer> findDuplicates(int[] n) {
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
        // System.out.print(Arrays.toString(n));
        for(i=0;i<n.length;i++){
            if(n[i]!=i+1)
            ans.add(n[i]);
        }
        return ans;
    }
}