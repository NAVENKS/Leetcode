class Solution {
    public int lengthOfLastWord(String s) {
        int l=s.length();
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i)==' ')
            continue;
            if(s.charAt(i)!=' '){
                int j=i;
                int c=0;
                while(j>=0 && s.charAt(j)!=' '){
                    j--;
                    c++;
                }
                return c;
            }
        }
        return 0;
    }
}