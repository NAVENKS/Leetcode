class Solution {
    public int[] plusOne(int[] d) {
        int count=0;
        int ans[];
        for(int i=0;i<d.length;i++){
            if(d[i]==9)
            count++;
        }
        if(count==d.length)
        ans=new int[count+1];
        else
        ans=new int[d.length];
        int i=d.length-1;
        int carry=1;
        while(i>=0){
            int sum=carry;
            sum+=d[i];
            ans[i]=sum%10;
            carry=sum/10;
            i--;
        }
        if(carry>0)ans[0]=carry;
        return ans;
    }
}