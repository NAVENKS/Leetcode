class Solution {
    public int centre(String s,int l,int h){
        int c=0;
        while(l>=0 && h<s.length() && s.charAt(l)==s.charAt(h)){
            c++;
            l--;
            h++;
        }
        return c;
    }
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=centre(s,i,i);
            ans+=centre(s,i,i+1);
        }
        return ans;
    }
}