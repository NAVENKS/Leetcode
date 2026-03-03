class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int currMax = 0;
        int maxSum = nums[0];

        int currMin = 0;
        int minSum = nums[0];

        for (int n : nums) {
            total += n;
            currMax = Math.max(n, currMax + n);
            maxSum = Math.max(maxSum, currMax);
            
            currMin = Math.min(n, currMin + n);
            minSum = Math.min(minSum, currMin);
        }
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }
}