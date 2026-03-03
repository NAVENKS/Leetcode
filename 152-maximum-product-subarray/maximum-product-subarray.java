class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p=p*nums[j];
                max=Math.max(max,p);
            }
        }
        return max;
    }
}