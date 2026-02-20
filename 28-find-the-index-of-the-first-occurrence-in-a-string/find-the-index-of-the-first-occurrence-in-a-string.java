class Solution {
    public int strStr(String h, String n) {
        for(int i=0;i<=h.length()-n.length();i++){
        boolean ans=true;
        int j=0;
            if(h.charAt(i)==n.charAt(0)){
                int s=i,e=i+n.length()-1;
                for(;s<=e;s++){
                    if(h.charAt(s)!=n.charAt(j++)){
                        ans=false;
                        break;
                    }
                }
                if(ans)
                return i;
            }
        }
        return -1;
    }
}