class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String str[]=s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            String t=str[i];
            ans.append(t);
            if(i!=0)
            ans.append(" ");
        }
        return ans.toString();
    }
}