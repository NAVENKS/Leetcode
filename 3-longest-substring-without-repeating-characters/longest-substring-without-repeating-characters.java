class Solution {
    public int lengthOfLongestSubstring(String s) {
        int map[]=new int[128];
        Arrays.fill(map,0);
        int i=0;
        int ans=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            map[ch]+=1;
            while(map[ch]>1){
                map[s.charAt(i)]-=1;
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}