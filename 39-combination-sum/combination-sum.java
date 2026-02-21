class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void comb(int i,int arr[],int t,List<Integer>l){
        if(i==arr.length)return;
        else if(t==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        else if(arr[i]<=t){
            l.add(arr[i]);
            comb(i,arr,t-arr[i],l);
            l.remove(l.size()-1);
        }
        comb(i+1,arr,t,l);
    }
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        comb(0,arr,t,new ArrayList<>());
        return ans;
    }
}