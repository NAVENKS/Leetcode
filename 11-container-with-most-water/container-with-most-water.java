class Solution {
    public int maxArea(int[] arr) {
        int max=Integer.MIN_VALUE;
        int s=0,e=arr.length-1;
        while(s<e){
            max=Math.max(max,Math.min(arr[s],arr[e])*(e-s));
            if(arr[s]<=arr[e])s++;
            else e--;
        }
        return max;
    }
}