class Solution {
    public int compress(char[] s) {
        int c = 1;
        char prev = s[0];
        StringBuilder count = new StringBuilder();
        int i = 0;
        for (int j = 1; j < s.length; j++) {
            if (prev == s[j]) {
                c++;
            } else {
                if (c == 1) {
                    s[i++] = prev;
                    c = 1;
                    prev = s[j];
                } else {
                    s[i++] = prev;
                    String num = Integer.toString(c);
                    for (char ch : num.toCharArray()) {
                        s[i++] = ch;
                    }

                    c = 1;
                    prev = s[j];

                }
            }
        }
        if (c == 1) {
            s[i++] = prev;
        } else {
            s[i++] = prev;
            String num = Integer.toString(c);
            for (char ch : num.toCharArray()) {
                s[i++] = ch;
            }

        }
        return i;
    }
}