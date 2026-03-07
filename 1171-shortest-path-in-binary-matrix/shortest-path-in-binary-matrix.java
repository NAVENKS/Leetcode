class Solution {
    public int shortestPathBinaryMatrix(int[][] arr) {
        if (arr[0][0] == 1)
            return -1;
        Queue<int[]> que = new LinkedList<>();
        int[][] w = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++)
            Arrays.fill(w[i], Integer.MAX_VALUE);
        que.offer(new int[] { 0, 0 });
        w[0][0] = 1;
        int dir[][] = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }, { -1, -1 }, { -1, 1 }, { 1, 1 }, { 1, -1 } };
        while (!que.isEmpty()) {
            int n[] = que.poll();
            for (int d[] : dir) {
                int r = n[0] + d[0];
                int c = n[1] + d[1];
                if (r >= 0 && c >= 0 && c < arr[0].length && r < arr.length && arr[r][c] == 0) {
                    int p = w[r][c];
                    if (p > (w[n[0]][n[1]]+1)) {
                        w[r][c] = w[n[0]][n[1]] + 1;
                        que.offer(new int[] { r, c });
                        if(r==arr.length-1 && c==arr[c].length-1)
                        que.poll();
                    }
                }
            }
        }
        return w[arr.length - 1][arr[0].length - 1]==Integer.MAX_VALUE?-1:w[arr.length - 1][arr[0].length - 1];
    }
}