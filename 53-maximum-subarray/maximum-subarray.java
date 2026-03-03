class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = 0;
        int maxSum = nums[0];
        for (int n : nums) {
            currMax = Math.max(n, currMax + n);
            maxSum = Math.max(maxSum, currMax);
        }
        return maxSum;
    }
}