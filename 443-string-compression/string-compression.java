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
                System.out.println(prev);
                if (c == 1) {
                    s[i++] = prev;
                    c = 1;
                    prev = s[j];
                } else {
                    count.append(c + "");
                    s[i++] = prev;
                    for (int l=0;l<count.length();l++) {
                        s[i++] = count.charAt(l);
                    }
                    c = 1;
                    prev = s[j];
                    count = new StringBuilder();
                }
            }
        }
        if (c == 1) {
            s[i++] = prev;
        } else {
            count.append(c + "");
            s[i++] = prev;
            for (char ch : count.toString().toCharArray()) {
                s[i++] = ch;
            }

        }
        return i;
    }
}