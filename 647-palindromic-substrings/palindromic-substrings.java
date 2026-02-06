class Solution {
    public int countSubstrings(String s) {
        int ans=s.length();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String sub=s.substring(i,j+1);
                StringBuilder rev=new StringBuilder(sub);
                rev=rev.reverse();
                // System.out.print(" "+rev+" "+sub);
                if(sub.equals(rev.toString())){
                    ans++;
                }
            }
        }
            return ans;
    }
}