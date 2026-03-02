class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int i=0,ans=0;
        for(int c:s){
            if(c>=g[i]){
                ans++;
                i++;
            }
            if(i>=g.length)break;
        }
        return ans;
    }
}