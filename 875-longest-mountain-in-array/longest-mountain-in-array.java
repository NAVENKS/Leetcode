class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if(n < 3) return 0;
        int max = 0;
        int i = 1;
        while(i < n-1){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                int left = i;
                int right = i;
                while(left-1 >= 0 && arr[left] > arr[left-1])
                    left--;
                while(right+1 < n && arr[right] > arr[right+1])
                    right++;
                max = Math.max(max, right-left+1);
                i = right;
            }
            else{
                i++;
            }
        }
        return max;
    }
}
