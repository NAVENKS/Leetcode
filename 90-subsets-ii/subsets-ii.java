class Solution {
    public void comb(int i, int arr[], List<Integer> l, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(l));
        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1])
                continue;
            l.add(arr[j]);
            comb(j + 1, arr,l, ans);
            l.remove(l.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(arr);
        comb(0,arr,new ArrayList<>(),ans);
        return ans;
    }
}