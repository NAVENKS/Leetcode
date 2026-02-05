class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder(s);
        String vow="aeiouAEIOU";
        int n=s.length();
        int i=0,j=s.length()-1;
        if(n==1)return s;
        while(i<=j){
            while(i<n && !vow.contains(s.charAt(i)+""))
            i++;
            while(j>=0 && !vow.contains(s.charAt(j)+""))
            j--;
            if(i>n-1 || j<0)return ans.toString();
            ans.setCharAt(i,s.charAt(j));
            ans.setCharAt(j,s.charAt(i));
            i++;
            j--;
        }
        return ans.toString();
    }
}