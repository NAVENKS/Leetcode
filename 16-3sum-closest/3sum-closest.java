class Solution {
    public int threeSumClosest(int[] n, int t) {
        Arrays.sort(n);
        HashSet<Integer>ans=new HashSet<>();
        for(int s=0;s<n.length-2;s++){
            int i=s+1,j=n.length-1;
            // if(s>0 && n[s]==n[s+1])continue;
            while(i<j){
                int sum=n[s]+n[i]+n[j];
                ans.add(sum);
                if(sum>=t)
                j--;
                else if(sum<=t)
                i++;
            }
        }
        int answer=0,d=Integer.MAX_VALUE;
        for(int a:ans){
            if(Math.abs(a-t)<d)
            {
                answer=a;
                d=Math.abs(a-t);
            }
            System.out.print(a+" ");
        }
        return answer;
    }
}