class Solution {
    public int trap(int[] height) {
        int max=0;
        int pre[]=new int[height.length];
        int suf[]=new int[height.length];
        for(int i=0;i<height.length;i++){
            if(max<=height[i])
            max=height[i];
            pre[i]=max;
        }
        max=0;
        for(int i=height.length-1;i>=0;i--){
            if(max<=height[i])
            max=height[i];
            suf[i]=max;
        }
        int water=0;
        for(int i=0;i<height.length;i++){
            int min=Math.min(pre[i],suf[i]);
            water+=min-height[i];
        }
        return water;
    }
}   