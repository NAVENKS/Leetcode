class Solution {
    public boolean canFinish(int n, int[][] p) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int income[]=new int [n];
        Queue<Integer>q=new LinkedList<>();
        ArrayList<Integer>ans=new ArrayList<>();
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
            ans.add(poll);
            for(int a:adj.get(poll)){
                income[a]--;
                if(income[a]==0){
                    q.offer(a);
                }
            }
        }
        return ans.size()==n;
    }
}