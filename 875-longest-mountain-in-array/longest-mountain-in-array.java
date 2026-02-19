class Solution {
    public int longestMountain(int[] arr) {
        int l=arr.length;
        if(l<3)return 0;
        int max=0;
        for(int i=1;i<l-1;i++){
            int left=i,right=i;
            while(left-1>=0 && arr[left]>arr[left-1])left--;
            while(right+1<l && arr[right]>arr[right+1])right++;
            if(left < i && right > i)
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}