class Solution {
    public int[][] insert(int[][] arr, int[] ne) {
        int[][] n = new int[arr.length + 1][2];
        int i = 0, k = 0;
        while (i < arr.length && arr[i][0] < ne[0]) {
            n[k++] = arr[i++];
        }
        n[k++] = ne;
        while (i < arr.length) {
            n[k++] = arr[i++];
        }
        List<int[]> l = new ArrayList<>();
        i = 0;
        while (i < n.length) {
            int j = i + 1;
            int z = n[i][1];
            while (j < n.length && z >= n[j][0]) {
                z = Math.max(z, n[j][1]);
                j++;
            }
            l.add(new int[] { n[i][0], z });
            if (i == j)
                i++;
            else
                i = j;
        }
        int ans[][] = new int[l.size()][2];
        for (int b = 0; b < l.size(); b++) {
            ans[b] = l.get(b);
        }
        return ans;
    }
}