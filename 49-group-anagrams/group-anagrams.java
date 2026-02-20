class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<Character, Integer> map[] = new HashMap[str.length];
        for (int i = 0; i < str.length; i++) {
            map[i] = new HashMap<>();
        }
        for (int j = 0; j < str.length; j++) {
            String s = str[j];
            for (int i = 0; i < s.length(); i++) {
                map[j].put(s.charAt(i), map[j].getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        boolean vis[] = new boolean[str.length];
        Arrays.fill(vis, false);
        int i = 0;
        while (i < str.length) {
            List<String>t=new ArrayList<>();
            if (vis[i] == false) {
                vis[i]=true;
                t.add(str[i]);
                for (int j = 0; j < str.length; j++) {
                    if (map[i].equals(map[j]) && i != j && vis[j] == false) {
                        vis[j]=true;
                        t.add(str[j]);
                    }
                }
            }
            if(!t.isEmpty())
            ans.add(t);
            i++;
        }
        return ans;
    }
}