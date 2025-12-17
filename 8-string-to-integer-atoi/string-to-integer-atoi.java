class Solution {
    void fun(String s,long n[],int in){
        if(in>=s.length() || (s.charAt(in)-48)<0 || (s.charAt(in)-48)>9 ||n[0]>Integer.MAX_VALUE)return;
        long num=s.charAt(in)-48;
        n[0]=(n[0]*10)+num;
        fun(s,n,in+1);
    }
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)return 0;
        long n[]={0};
        int sign=1;
        sign = (s.charAt(0) == '-') ? -1 : 1;
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){
            fun(s,n,1);
        }
        else
        fun(s,n,0);
        System.out.print(n[0]);
        if(n[0]>Integer.MAX_VALUE)
        return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
        return (int)(n[0]*sign);
    }
}