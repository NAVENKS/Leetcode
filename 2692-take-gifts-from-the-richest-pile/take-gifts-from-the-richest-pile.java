class Solution {
    public long pickGifts(int[] g, int k) {
        long ans=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<g.length;i++){
            pq.offer(g[i]);
        }
        for(int i=0;i<k;i++){
            double t=pq.poll();
            t=Math.sqrt(t);
            int ke=(int)Math.floor(t);
            pq.offer(ke);
        }
        while(!pq.isEmpty()){
            // System.out.print(pq.peek()+" ");
            ans+=pq.poll();
        }
        return ans;
    }
}