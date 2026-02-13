class Solution {
    public int longestPalindrome(String s) {
        int h[] = new int[128];
        int l=s.length();
        int ans=0;
        boolean f=true;
        Arrays.fill(h,0);
        for(int i=0;i<l;i++){
            h[s.charAt(i)]++;
        }
        if(h[s.charAt(0)]==l)return l;
        for(int i=0;i<l;i++){
            if(h[s.charAt(i)]%2==0){
                ans+=h[s.charAt(i)];
                h[s.charAt(i)]=0;
            }
            else if(h[s.charAt(i)]%2!=0 && h[s.charAt(i)]!=1){
                ans+=h[s.charAt(i)];
                h[s.charAt(i)]=1;
                ans--;
            }
            else if(h[s.charAt(i)]==1 && f){
                ans+=1;
                f=false;
            }
        }
        return ans;
    }
}