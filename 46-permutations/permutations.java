class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void permutation(int nums[], int index) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums)
                list.add(num);
            ans.add(list);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
            permutation(nums, index + 1);
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        permutation(nums, 0);
        return ans;
    }
}