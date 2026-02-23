class Solution {
    private boolean ans = false;

    public void search(int w, int i, int j, char[][] board, String word, boolean[][] vis) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || w >= word.length())
            return;
        if (board[i][j] == word.charAt(w) && vis[i][j] == false) {
            if (w == word.length() - 1){
                ans = true;
                return;
            }
            vis[i][j] = true;
            search(w + 1, i + 1, j, board, word, vis);
            search(w + 1, i - 1, j, board, word, vis);
            search(w + 1, i, j + 1, board, word, vis);
            search(w + 1, i, j - 1, board, word, vis);
            vis[i][j] = false;
        }
    }

    public boolean exist(char[][] board, String word) {
        boolean vis[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                vis[i][j] = false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0))
                    search(0, i, j, board, word, vis);
                if(ans)return ans;
            }
        }
        return ans;
    }
}