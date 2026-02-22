class Solution {
    List<String> ans = new ArrayList<>();

    public void generate(int o, int c, StringBuilder s) {
        if (c == 0 && o == 0) {
            ans.add(new String(s.toString()));
            return;
        }
        if (c < o)
            return;
        if (o > 0) {
            s.append('(');
            generate(o - 1, c, s);
            s.deleteCharAt(s.length() - 1);
        }
        if (c > 0) {
            s.append(')');
            generate(o, c - 1, s);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        generate(n, n, new StringBuilder());
        return ans;
    }
}