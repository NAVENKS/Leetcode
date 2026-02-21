class Solution {
    public void comb(int i, int arr[], int t, List<Integer> l, List<List<Integer>> ans) {
        if (t == 0) {
            ans.add(new ArrayList<>(l));
            return;
        }
        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1])
                continue;
            if (arr[j] > t)
                break;
            l.add(arr[j]);
            comb(j + 1, arr, t - arr[j], l, ans);
            l.remove(l.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        comb(0, arr, t, new ArrayList<>(), ans);
        return ans;
    }
}