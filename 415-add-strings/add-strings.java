class Solution {
    public String addStrings(String n1, String n2) {
        StringBuilder s=new StringBuilder();
        int i=n1.length()-1,j=n2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int sum=carry;
            if(i>=0)sum+=Integer.parseInt(n1.charAt(i)+"");
            if(j>=0)sum+=Integer.parseInt(n2.charAt(j)+"");
            s.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        return s.reverse().toString();
    }
}