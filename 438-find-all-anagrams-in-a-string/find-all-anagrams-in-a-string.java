class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        
        if (s.length() < p.length()) return res;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            // Add current character to window
            sCount[s.charAt(i) - 'a']++;

            // Remove left character if window size exceeded
            if (i >= k) {
                sCount[s.charAt(i - k) - 'a']--;
            }

            // Compare arrays
            if (Arrays.equals(pCount, sCount)) {
                res.add(i - k + 1);
            }
        }

        return res;
    }
}
