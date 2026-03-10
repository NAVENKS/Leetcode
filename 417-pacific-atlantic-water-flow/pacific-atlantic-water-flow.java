class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] arr) {
        int dir[][] = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                Stack<int[]> stack = new Stack<>();
                boolean vis[][] = new boolean[arr.length][arr[0].length];
                stack.push(new int[] { i, j });
                int atlantic = 0;
                int pacific = 0;
                if (i == arr.length - 1 || j == arr[0].length - 1)
                    atlantic = 1;
                if (i == 0 || j == 0)
                    pacific = 1;
                if (atlantic == 1 && pacific == 1) {
                                ans.add(new ArrayList<>(Arrays.asList(i, j)));
                                continue;
                            }
                while (!stack.isEmpty()) {
                    int pop[] = stack.pop();
                    vis[pop[0]][pop[1]] = true;
                    for (int d[] : dir) {
                        int r = d[0] + pop[0];
                        int c = d[1] + pop[1];
                        if (r < arr.length && c < arr[0].length && c >= 0 && r >= 0 && vis[r][c] == false
                                && arr[pop[0]][pop[1]] >= arr[r][c]) {
                            vis[r][c] = true;
                            stack.push(new int[] { r, c });
                            if (r == arr.length - 1 || c == arr[0].length - 1)
                                atlantic = 1;
                            if (r == 0 || c == 0)
                                pacific = 1;
                            if (atlantic == 1 && pacific == 1) {
                                ans.add(new ArrayList<>(Arrays.asList(i, j)));
                                break;
                            }
                        }
                    }
                    if (atlantic == 1 && pacific == 1) {
                        break;
                    }
                }
            }
        }
        return ans;
    }
}