class Solution {
    public long subArrayRanges(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        int nle[]=new int [nums.length];
        int ple[]=new int [nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                stack.pop();
            }
            nle[i]=stack.isEmpty()?nums.length:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            ple[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        long ans=0;
        for(int i=0;i<nums.length;i++){
            int left=nle[i]-i;
            int right=i-ple[i];
            ans+=(long)nums[i]*left*right;
        }
        stack.clear();
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i]){
                stack.pop();
            }
            nle[i]=stack.isEmpty()?nums.length:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            ple[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        for(int i=0;i<nums.length;i++){
            int left=nle[i]-i;
            int right=i-ple[i];
            ans-=(long)nums[i]*left*right;
        }
        return ans;
    }
}