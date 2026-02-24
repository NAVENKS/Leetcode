class Solution {
    public int addRungs(int[] rungs, int dist) {
        int ans=0;
        if(rungs[0]>dist){
            int gap=rungs[0]-dist;
            ans=(rungs[0]/dist);
            if(rungs[0]%dist==0){
                ans-=1;
            }
        }
        for(int i=0;i<rungs.length-1;i++){
            int gap=rungs[i+1]-rungs[i];
            ans+=(gap/dist);
            if(gap%dist==0)
            ans-=1;
        }
        return ans;
    }
}