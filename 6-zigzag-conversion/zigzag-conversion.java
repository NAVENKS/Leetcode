class Solution {
    public String convert(String s, int row) {
        if(s.length()<2 || row==1)return s;
        char ch[][]=new char[row][(s.length()/2)+1];
        for(int i=0;i<row;i++)
        Arrays.fill(ch[i],'*');
        int i=0;
        int r=0,c=0;
        // System.out.print(r++ +" "+ c +" | ");
        ch[0][0]=s.charAt(i++);
        r++;
        while(i<s.length()){
            for(int j=0;j<row-1;j++){
                if(i<s.length())
                ch[r++][c]=s.charAt(i++);
                // System.out.print(r++ +" "+ c +" | ");
                // i++;
            }
            r--;
            System.out.println();
            for(int j=0;j<row-1;j++){
                if(i<s.length())
                ch[--r][++c]=s.charAt(i++);
                // System.out.print(--r +" "+ ++c +" | ");
                // i++;
            }
            r++;
            // System.out.println();
        }
        StringBuilder str = new StringBuilder();
        for(int j=0;j<row;j++){
            for(int k=0;k<ch[0].length;k++){
                if(ch[j][k]!='*')
                str.append(ch[j][k]);
            }
        }
        return str.toString();
        // return "";
    }
}