class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str=new StringBuilder();
        char ans[]=new char[s.length()];
        Arrays.fill(ans,'*');
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }
            else if(!stack.isEmpty() && s.charAt(stack.peek())=='(' && ch==')'){
                int p=stack.peek();
                stack.pop();
                ans[p]='(';
                ans[i]=')';
            }
        }
        System.out.println(Arrays.toString(ans));
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || ans[i]!='*')
            str.append(ch);
        }
        return str.toString();
    }
}