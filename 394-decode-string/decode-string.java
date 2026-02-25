class Solution {
    public String decodeString(String s) {

        StringBuilder curr = new StringBuilder();
        StringBuilder num = new StringBuilder();

        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num.append(ch);
            }

            else if (ch == '[') {
                countStack.push(Integer.parseInt(num.toString()));
                stringStack.push(curr);
                curr = new StringBuilder();
                num = new StringBuilder();
            }

            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();

                String repeated = curr.toString().repeat(repeat);
                curr = prev.append(repeated);
            }

            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}