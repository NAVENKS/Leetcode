class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] f = new int[n];
        int[] result = new int[n - k + 1];
        f[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                f[i] = f[i - 1] + 1;
            } else {
                f[i] = 1;
            }
        }
        int idx = 0;
        for (int i = k - 1; i < n; i++) {
            if (f[i] >= k) {
                result[idx++] = nums[i];
            } else {
                result[idx++] = -1;
            }
        }

        return result;
    }
}
