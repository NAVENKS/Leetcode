class Solution {
    public int[] nextGreaterElements(int[] num) {
        int n=num.length;
        int res[]=new int[num.length];
        Arrays.fill(res,-1);
        Stack<Integer>stack=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int a=num[i%n];
            while(!stack.isEmpty() && stack.peek()<=a){
                stack.pop();
            }
            if(!stack.isEmpty() && i<n){
               res[i]=stack.peek(); 
            }
            stack.push(a);
        }
        return res;
    }
}