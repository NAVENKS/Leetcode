class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int j=i+1,k=arr.length-1;
            if(i>0 && arr[i]==arr[i-1])continue;
            while(j<k){
                if(x+arr[j]+arr[k]==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(x);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1])j++;
                    while(k>=0 && arr[k]==arr[k+1])k--;
                }
                else if((x+arr[j]+arr[k])>0)
                k--;
                else
                j++;
            }
        }
        return ans;
    }
}