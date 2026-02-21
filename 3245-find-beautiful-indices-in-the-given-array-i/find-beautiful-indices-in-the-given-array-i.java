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
        int j = 0;

    for (int i : index1) {

        // move pointer forward while index2[j] is too small
        while (j < index2.size() && index2.get(j) < i - k) {
            j++;
        }

        // check valid range
        if (j < index2.size() && Math.abs(index2.get(j) - i) <= k) {
            ans.add(i);
        }
    }

    return ans;
    }
}