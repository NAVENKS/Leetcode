class Solution {
    public int countSubstrings(String s) {
        int ans=s.length();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                boolean flag=true;
                int l=i,h=j;
                while(l<=h){
                    if(s.charAt(l)!=s.charAt(h)){
                        flag=false;
                        break;
                    }
                    l++;
                    h--;
                }
                if(flag){
                    ans++;
                }
            }
        }
            return ans;
    }
}