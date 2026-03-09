class Solution {
    public int maximumDetonation(int[][] arr) {

        int n = arr.length;
        List<Integer>[] list = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                long dx = arr[i][0] - arr[j][0];
                long dy = arr[i][1] - arr[j][1];
                long r = arr[i][2];
                if (((dx * dx) + (dy * dy)) <= (r * r)) {
                    list[i].add(j);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            Stack<Integer> stack = new Stack<>();
            int c = 0;
            boolean vis[] = new boolean[arr.length];
            stack.push(i);
            while (!stack.isEmpty()) {
                int pop = stack.pop();
                c++;
                vis[pop] = true;
                for (int k : list[pop]) {
                    if (vis[k] == false){
                        vis[k]=true;
                        stack.push(k);
                    }
                }
            }
            max = Math.max(max, c);
            if(max==arr.length)return max;
        }
        return max;
    }
}