class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0],ans=0;
        for(int i:nums){
            min=Math.min(i,min);
        }
        for(int i=0;i<nums.length;i++){
            ans+=nums[i]-min;
        }
        return ans;
    }
}