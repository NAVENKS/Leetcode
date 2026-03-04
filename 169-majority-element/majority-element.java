class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        long ans = 0;
        int c = 1, d = nums[0], i = 1;
        for (; i < nums.length; i++) {
            if (nums[i] == d)
                c++;
            else {
                if (c > max) {
                    max = c;
                    ans = d;
                }
                d = nums[i];
                c = 1;
            }
        }
        if (c > max) {
            max = c;
            ans = d;
        }
        return (int) ans;
    }
}