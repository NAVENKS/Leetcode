class Solution {
    public int lengthOfLongestSubstring(String s) {
        int []map=new int[128];
        if(s.length()==0)return 0;
        int l=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map[ch]++;
            while(map[ch]>1){
                map[s.charAt(l)]--;
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}