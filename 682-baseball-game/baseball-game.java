class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(String str:operations){
            char ch=str.charAt(0);
            if(Character.isDigit(ch) || ch=='-'){
                stack.push(Integer.parseInt(str));
            }
            else if(ch=='+'){
                int pop=stack.pop();
                int sum=pop+stack.peek();
                stack.push(pop);
                stack.push(sum);
            }
            else if(ch=='D'){
                int tem=stack.peek();
                stack.push(stack.peek()*2);
            }
            else{
                stack.pop();
            }
        }
            int ans=0;
            while(!stack.isEmpty()){
                int pop=stack.pop();
                ans+=pop;
                System.out.print(pop+" ");
            }
        return ans;
    }
}