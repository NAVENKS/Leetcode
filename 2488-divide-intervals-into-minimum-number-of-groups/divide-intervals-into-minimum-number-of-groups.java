class Solution {
    public int minGroups(int[][] n) {
        Arrays.sort(n,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i[]:n){
            if(!pq.isEmpty() && pq.peek()<i[0])
            pq.poll();
            pq.offer(i[1]);
        }
        return pq.size();
    }
}