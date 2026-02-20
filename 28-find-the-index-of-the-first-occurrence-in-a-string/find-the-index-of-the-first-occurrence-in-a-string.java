class Solution {
    public int[] build(String pattern){
        int len=0;
        int i=1;
        int lps[]=new int[pattern.length()];
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public int strStr(String h, String n) {
        int lps[]=build(n);
        int i=0,j=0;
        while(i<h.length()){
            if(h.charAt(i)==n.charAt(j)){
                i++;
                j++;
            }
            if(j==n.length())
            return i-j;
            else if (i < h.length() && h.charAt(i) != n.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }
}