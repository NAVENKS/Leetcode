class Solution {
    public String clearDigits(String s) {
        Deque<Character>stack=new ArrayDeque<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch))
            stack.removeLast();
            else
            stack.addLast(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty())
        ans.append(stack.removeFirst());
        return ans.toString();
    }
}