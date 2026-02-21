class Solution {
    public int[] lps(String s){
        int len=0,i=1;
        int n=s.length();
        int lps[]=new int [n];
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public List<Integer> find(String s,String a){
        List<Integer>index1=new ArrayList<>();
        int i=0,j=0,m=a.length();
        int n=s.length();
        int lps[]=lps(a);
        while(i<n){
            if(s.charAt(i)==a.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                index1.add(i-j);
                j=lps[j-1];
            }
            else if(i<n && s.charAt(i)!=a.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    j=0;
                    i++;
                }
            }
        }
        return index1;
    }
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer>index1=find(s,a);
        List<Integer>index2=find(s,b);
        List<Integer>ans=new ArrayList<>();
        for(int i:index1){
            for(int j:index2){
                if(Math.abs(i-j)<=k){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}