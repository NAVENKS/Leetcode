class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int d = nums[0];
        int c = 1, j = 1;
        for (; j < nums.length; j++) {
            if (d == nums[j]) {
                c++;
            }
            if (d != nums[j]) {
                if (c == 1)
                    nums[i++] = d;
                else {
                    nums[i++] = d;
                    nums[i++] = d;
                }
                d = nums[j];
                c = 1;
            }
        }
        if (c == 1)
            nums[i++] = d;
        else {
            nums[i++] = d;
            nums[i++] = d;
        }
        return i;
    }
}