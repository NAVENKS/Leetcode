class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < firstList.length && j < secondList.length) {
            
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            
            if (start <= end) {
                result.add(new int[]{start, end});
            }
            
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        int[][] ans = new int[result.size()][2];
        
        for (int k = 0; k < result.size(); k++) {
            ans[k][0] = result.get(k)[0];
            ans[k][1] = result.get(k)[1];
        }
        
        return ans;
    }
}
