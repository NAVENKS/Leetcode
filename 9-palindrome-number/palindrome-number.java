class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int t=x;
        int rev=0;
        while(t!=0){
            rev=rev*10+(t%10);
            t/=10;
        }
        while(x!=0){
            if(x%10 != rev%10)return false;
            x/=10;
            rev/=10;
        }
        return true;
    }
}