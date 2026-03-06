class Solution {
    public boolean isPalindrome(String str) {
        int s = 0, e = str.length() - 1;
        str = str.toLowerCase();
        while (s <= e) {
            while (s < e && (!Character.isLetter(str.charAt(s)) && !Character.isDigit(str.charAt(s))))
                s++;
            while (e > s && (!Character.isLetter(str.charAt(e)) && !Character.isDigit(str.charAt(e))))
                e--;
            if (s < str.length() && e >= 0 && str.charAt(s) != str.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
}