class Solution {
    public int minOperations(String[] l) {
        Stack<String>a=new Stack<>();
        for(int i=0;i<l.length;i++){
            if(!a.isEmpty() && l[i].equals("../"))
            a.pop();
            else if(l[i].equals("./"))
            continue;
            else if(!l[i].equals("./") && !l[i].equals("../"))
            a.push(l[i]);
        }
        return a.size();
    }
}