class Solution {
    public int totalFruit(int[] f) {
        int max = Integer.MIN_VALUE;
        int a = -1, b = -1, j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < f.length; i++) {

            if (a == -1)
                a = f[i];
            else if (b == -1 && a != f[i])
                b = f[i];

            map.put(f[i], map.getOrDefault(f[i], 0) + 1);

            if (a != f[i] && b != f[i]) {
                while (map.size() > 2) {
                    map.put(f[j], map.get(f[j]) - 1);
                    if (map.get(f[j]) == 0) {
                        int removed = f[j];
                        map.remove(removed);
                        if (removed == a)
                            a = f[i];
                        else if (removed == b)
                            b = f[i];
                    }
                    j++;
                }
            }
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
