class Solution {
    public int[] findOrder(int n, int[][] p) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int income[]=new int [n];
        Queue<Integer>q=new LinkedList<>();
        int []ans=new int [n];
        int in=0;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<p.length;i++){
            int arr[]=p[i];
            adj.get(arr[1]).add(arr[0]);
            income[arr[0]]++;
        }
        for(int i=0;i<n;i++){
            if(income[i]==0)
            q.offer(i);
        }
        while(!q.isEmpty()){
            int poll=q.poll();
            ans[in++]=poll;
            for(int a:adj.get(poll)){
                income[a]--;
                if(income[a]==0){
                    q.offer(a);
                }
            }
        }
        System.out.print(in-1);
        return in==n?ans:new int[0];
    }
}