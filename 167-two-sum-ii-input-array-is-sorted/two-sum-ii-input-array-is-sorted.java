class Solution {
    public int[] twoSum(int[] arr, int t) {
        int l=0,r=arr.length-1;
        while(l<r){
            if((arr[l]+arr[r]) == t) return new int[]{l+1,1+r};
            else if((arr[l]+arr[r]) > t)r--;
            else l++;
        }
        return new int[2];
    }
}