class Solution {
    public String reverseStr(String str, int k) {
        StringBuilder ans = new StringBuilder(str);
        int c=str.length()/(2*k);
        int s=(2*k);
        for(int i=1;i<=c;i++){
            System.out.print(s+" ");
            int start=s-(2*k);
            int end=start+k-1;
            while(start<=end){
                ans.setCharAt(start,str.charAt(end));
                ans.setCharAt(end,str.charAt(start));
                start++;
                end--;
            }
            s+=2*k;
        }
        s=s-(2*k);
        System.out.println(s+" After ");
        if(s<(str.length())){
            if((str.length()-s)>=k){
                int start=s;
                int end=s+k-1;
                while(start<=end){
                ans.setCharAt(start,str.charAt(end));
                ans.setCharAt(end,str.charAt(start));
                start++;
                end--;
            }
            }
            else{
                int start=s;
                int end=str.length()-1;
                while(start<=end){
                ans.setCharAt(start,str.charAt(end));
                ans.setCharAt(end,str.charAt(start));
                start++;
                end--;
            }
        }
    }
        return ans.toString();
    }
}