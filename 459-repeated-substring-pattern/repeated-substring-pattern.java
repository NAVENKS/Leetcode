class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=0,i=1,n=s.length();
        int lps[]=new int [n];
        int c=-1;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                if(c==-1)c=i;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[len]=0;
                    i++;
                }
            }
        }
        int longestPrefixSuffix = lps[n - 1];
        return longestPrefixSuffix > 0 &&
               n % (n - longestPrefixSuffix) == 0;
    }
}