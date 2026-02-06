class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            int l = i, h = i;
            while (l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
                l--;
                h++;
            }
            String p = s.substring(l + 1, h);
            if (p.length() > ans.length()) {
                ans = p;
            }
            l = i;
            h = i + 1;
            while (l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
                l--;
                h++;
            }
            p = s.substring(l + 1, h);
            if (p.length() > ans.length()) {
                ans = p;
            }
        }
        return ans;
    }
}
