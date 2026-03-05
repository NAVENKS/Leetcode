class Solution {
    public int jump(int[] arr) {
        int jump=0;
        int max=0,curr=0;
        for(int i=0;i<arr.length-1;i++){
            max=Math.max(max,arr[i]+i);
            if(curr==i){
                jump++;
                curr=max;
            }
        }
        return jump;
    }
}