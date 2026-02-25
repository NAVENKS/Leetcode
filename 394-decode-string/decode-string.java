class Solution {
    int i = 0;
    public String decodeString(String s) {
        return decode(s);
    }
    public String decode(String s) {

        StringBuilder result = new StringBuilder();
        int repeat = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                repeat = repeat * 10 + (ch - '0');
            }
            else if (ch == '[') {
                i++;
                String decoded = decode(s);
                result.append(decoded.repeat(repeat));
                repeat = 0;
            }
            else if (ch == ']') {
                return result.toString();
            }
            else {
                result.append(ch);
            }
            i++;
        }
        return result.toString();
    }
}