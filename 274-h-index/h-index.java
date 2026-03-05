class Solution {
    public int hIndex(int[] arr) {
        int tem[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr.length)
            tem[tem.length-1]++;
            else
            tem[arr[i]]++;
        }
        for(int i=tem.length-1;i>0;i--){
            if(tem[i]>=i)return i;
            else{
                tem[i-1]+=tem[i];
            }
        }
        return 0;
    }
}