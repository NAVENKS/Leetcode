class Solution {
    public int maxProfit(int[] arr) {
        int p=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
            p+=arr[i+1]-arr[i];
        }
        return p;
    }
}