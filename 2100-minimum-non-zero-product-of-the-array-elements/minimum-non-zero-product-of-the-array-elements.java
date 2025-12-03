class Solution {
    long myPow(long base,long exp)
    {
        long ctr;
        long pow=1;
        for(ctr=1;ctr<=exp;ctr++)
            pow=(pow*base);
        return pow;
    }
    long bin_exp(long base,long exp)
    {
        if(exp==1)  return base%1000000007;
        if(exp==0) return 1;
        long half=exp/2;
        long half_ans=bin_exp(base,half)%1000000007;
        long full_ans=(half_ans*half_ans)%1000000007;
        if(exp%2==1)
            full_ans=(full_ans*base)%1000000007;
        return full_ans%1000000007;
    }
    public int minNonZeroProduct(int p) {
        if(p==1)    return 1;
        long tp= myPow(2,p)-1;
        long res;
        res=bin_exp(((tp-1)%1000000007),tp/2)%1000000007 ;
        res=(res*(tp%1000000007))%1000000007;
        return (int)res;
    }
}
