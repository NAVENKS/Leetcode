class Solution {
    public  int func(int k){
        if(k==1)return 0;
        int res=func((k+1)/2);
        if(k%2==1) return res;
        else{
            if(res==1)return 0;
            else return 1;
        }
    }
    public int kthGrammar(int n, int k) {
        return func(k);
    }
}