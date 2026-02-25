class Solution {
    public int evalRPN(String[] num) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<num.length;i++){
            String ch = num[i];
            // System.out.print(ch+" ");
            if(ch.length()==1 && !Character.isDigit(ch.charAt(0))){
                int n1=stack.pop();
                int n2=stack.pop();
                char op=ch.charAt(0);
                if(op=='+')
                stack.push(n2+n1);
                else if(op=='-')
                stack.push(n2-n1);
                else if(op=='*')
                stack.push(n2*n1);
                else
                stack.push(n2/n1);
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}