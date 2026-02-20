class Solution {
    public int myAtoi(String s) {
        long ans=0;
        boolean neg=false;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            continue;
            else if(s.charAt(i)=='-' || s.charAt(i)=='+' || Character.isDigit(s.charAt(i))){
                if(s.charAt(i)=='-'){
                    neg=true;
                    start=i+1;
                }
                else if(s.charAt(i)=='+'){
                    start=i+1;
                }
                else
                start=i;
                break;
            }
            else return 0;
        }
        for(int i=start;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                ans=ans*10+(Integer.parseInt(s.charAt(i)+""));
                if(ans>Integer.MAX_VALUE)
                break;
            }
            else break;
        }
        if(neg)
        ans*=-1;
        if(ans>Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
        else if(ans<Integer.MIN_VALUE)
        return Integer.MIN_VALUE;
        return (int)ans;
    }
}