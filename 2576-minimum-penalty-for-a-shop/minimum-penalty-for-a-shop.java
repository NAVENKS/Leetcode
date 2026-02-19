class Solution {
    public int bestClosingTime(String str) {
        int p[]=new int [str.length()+1];
        int n[]=new int [str.length()+1];
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N')
            count++;
            p[i+1]=count;
        }
        count=0;
        for(int i=str.length()-1;i>=0;i--){
            n[i+1]=count;
            if(str.charAt(i)=='Y')
            count++;
        }
        n[0]=count;
        int max=0;
        for(int i=0;i<p.length;i++){
            if((p[max]+n[max])>(p[i]+n[i]))
            max=i;
        }
        return max;
    }
}