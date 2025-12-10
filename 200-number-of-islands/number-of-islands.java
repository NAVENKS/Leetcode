import java.util.*;

class Solution {
    public int numIslands(char[][] g) {
        int u = 1;
        int m[][] = new int[g.length][g[0].length];
        HashMap<Integer, List<String>> map = new HashMap<>();
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        for (int i = 0; i < m.length; i++)
            Arrays.fill(m[i], 0);

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                if (m[i][j] == 0 && g[i][j] == '1') {
                    m[i][j] = u;
                    map.put(u, new ArrayList<>());
                    map.get(u).add(i + "," + j);
                    u++;
                    System.out.println("h");
                }
                for (int in = 0; in < dir.length; in++) {
                    int wr = i + dir[in][0];
                    int wc = j + dir[in][1];
                    if (g[i][j] == '1' && wr >= 0 && wc >= 0 && wr < g.length && wc < g[0].length && g[wr][wc] == '1') {

                        if (m[wr][wc] > 0) {
                            int oldId = m[i][j];       // save old id
                            int newId = m[wr][wc];     // id to merge into

                            // safety: ensure valid ids and not already same
                            if (oldId > 0 && oldId != newId) {
                                List<String> oldList = map.get(oldId);
                                List<String> newList = map.get(newId);

                                // ensure newList exists
                                if (newList == null) {
                                    newList = new ArrayList<>();
                                    map.put(newId, newList);
                                }

                                if (oldList != null && !oldList.isEmpty()) {
                                    newList.addAll(oldList);   // merge lists
                                }

                                map.remove(oldId);         // delete old island entry

                                // update all matrix cells that had oldId -> newId
                                for (int r = 0; r < m.length; r++) {
                                    for (int c = 0; c < m[0].length; c++) {
                                        if (m[r][c] == oldId) {
                                            m[r][c] = newId;
                                        }
                                    }
                                }

                                System.out.println("io");
                            }
                            // else: oldId==newId or oldId==0 -> nothing to do
                        } else {
                            // neighbor unmarked: inherit my id
                            m[wr][wc] = m[i][j];

                            // ensure list exists before adding
                            List<String> list = map.get(m[i][j]);
                            if (list == null) {
                                list = new ArrayList<>();
                                map.put(m[i][j], list);
                            }
                            list.add(wr + "," + wc);
                        }
                    }
                }
            }
        }

        // debug print the id-matrix
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        return map.size();
    }
}
