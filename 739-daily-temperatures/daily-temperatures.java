class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int ans[]=new int[tem.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=tem.length-1;i>=0;i--){
            while(!stack.isEmpty() && tem[stack.peek()]<=tem[i])
            stack.pop();
            ans[i]=stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        return ans;
    }
}