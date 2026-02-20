class Solution {
    public int repeatedStringMatch(String a, String b) {
        int[] hash = new int[26];
        for (char ch : a.toCharArray()) {
            hash[ch - 'a']++;
        }
        for (char ch : b.toCharArray()) {
            if (hash[ch - 'a'] == 0) return -1;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0,i=0;
        while (sb.length() < (b.length()) || i<11) {
            sb.append(a);
            count++;
            if (sb.indexOf(b) != -1)
            return count;
            i++;
        }
        return -1;
    }
}