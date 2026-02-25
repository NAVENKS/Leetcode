class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Deque<Integer> stack = new ArrayDeque<>();
        int remove = nums.length - k;
        for(int num : nums){
            while(!stack.isEmpty() && stack.peekLast() > num && remove > 0){
                stack.removeLast();
                remove--;
            }
            stack.addLast(num);
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = stack.removeFirst();
        }
        return ans;
    }
}