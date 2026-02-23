class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && stack.peek() >= 0 && arr[i] < 0) {
                boolean flag=false;
                while (!stack.isEmpty() && stack.peek() >= 0 && arr[i] < 0) {
                    int p = stack.peek();
                    int n = arr[i] * -1;
                    if (p < n) {
                        stack.pop();
                        continue;
                    } else if (p == n) {
                        flag=true;
                        stack.pop();
                        break;
                    } else if (n < p) {
                        break;
                    }
                }
                if((stack.isEmpty() || stack.peek()<0) && !flag)
                stack.push(arr[i]);
            } else
                stack.push(arr[i]);
        }
        int ans[] = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}