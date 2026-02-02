class Solution {
    public int[] twoSum(int[] n, int t) {
        int i=0,j=n.length-1;
        int ans[]=new int[2];
        while(i<j){
            int sum=n[i]+n[j];
            if(sum==t){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(sum<t)
            i++;
            else
            j--;
        }
        return ans;
    }
}