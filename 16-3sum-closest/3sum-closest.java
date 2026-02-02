class Solution {
    public int threeSumClosest(int[] n, int t) {
        Arrays.sort(n);
        int answer = 0, d = Integer.MAX_VALUE;
        for (int s = 0; s < n.length - 2; s++) {
            int i = s + 1, j = n.length - 1;
            while (i < j) {
                int sum = n[s] + n[i] + n[j];
                if (Math.abs(sum - t) < d) {
                    answer=sum;
                    d = Math.abs(sum - t);
                }
                if (sum >= t)
                    j--;
                else if (sum <= t)
                    i++;
            }
        }
        return answer;
    }
}