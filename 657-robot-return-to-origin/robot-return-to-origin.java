class Solution {
    public boolean judgeCircle(String moves) {
        long ud=0;
        long lr=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U')
            ud++;
            else if(ch=='D')
            ud--;
            else if(ch=='R')
            lr++;
            else
            lr--;
        }
        if(ud==0 && lr==0)
        return true;
        return false;
    }
}