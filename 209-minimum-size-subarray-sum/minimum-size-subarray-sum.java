class Solution {
    public int minSubArrayLen(int t, int[] arr) {
        int l=0;
        int s=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            if(s>=t)
            min=Math.min(min,i-l+1);
            while(s>t && ((s-arr[l])>=t)){
                s-=arr[l++];
            }
            if(s>=t)
            min=Math.min(min,i-l+1);
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}