class Solution {
    public int lastStoneWeight(int[] n) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:n){
            pq.offer(i);
        }
        while(pq.size()>1){
            int t=pq.poll()-pq.poll();
            if(t>0)
            pq.offer(t);
        }
        return pq.size()>0?pq.peek():0;
    }
}