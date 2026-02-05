class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder(s);
        String vow="aeiouAEIOU";
        int n=s.length();
        int i=0,j=s.length()-1;
        if(n==1)return s;
        while(i<=j){
            char ci=s.charAt(i);
            char cj=s.charAt(j);
            if(!vow.contains(ci+""))
            i++;
            if(!vow.contains(cj+""))
            j--;
            else if(vow.contains(ci+"") && vow.contains(cj+"")){
                ans.setCharAt(i,cj);
                ans.setCharAt(j,ci);
                i++;
                j--;
            }
        }
        return ans.toString();
    }
}