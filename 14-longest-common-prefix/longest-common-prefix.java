class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)return strs[0];
        int l=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
        l=Math.min(l,strs[i].length());
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<l;i++){
            int c=1;
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(ch==strs[j].charAt(i))
                c++;
                else return ans.toString();
            }
            if(c==strs.length)
            ans.append(ch);
        }
        return ans.toString();
    }
}