class Solution {
    public String convert(String s, int row) {
        if(row==1)return s;
        StringBuilder str[] = new StringBuilder[row];
        for(int i=0;i<row;i++){
            str[i]=new StringBuilder();
        } 
        int r=1;
        int i=0;
        str[0].append(s.charAt(i++));
        while(i<s.length()){
            for(int j=0;j<row-1;j++){
                if(i<s.length())
                str[r++].append(s.charAt(i++));
            }
            r--;
            for(int j=row-2;j>=0;j--){
                if(i<s.length())
                str[--r].append(s.charAt(i++));
            }
            r++;
        }
        StringBuilder ans = new StringBuilder();
        for(int j=0;j<row;j++)
        ans.append(str[j]);
        return ans.toString();
    }
}