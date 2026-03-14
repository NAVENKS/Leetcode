class Solution {
    public boolean canConstruct(String a, String b) {
        int hash[]=new int[128];
        int len=0;
        for(char c:a.toCharArray()){
            if(hash[c]==0)len++;
            hash[c]++;
        }
        for(char c:b.toCharArray()){
            if(hash[c]!=0){
                hash[c]--;
                if(hash[c]==0)
                len--;
            }
        }
        return len==0;
    }
}