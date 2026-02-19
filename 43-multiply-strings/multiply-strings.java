class Solution {
    public String sum(String s1,String s2){
        StringBuilder ans=new StringBuilder();
        int carry=0;
        int i=s1.length()-1;
        int j=s2.length()-1;
        while(i>=0 || j>=0 || carry!=0){
            int sum=carry;
            int n1=0,n2=0;
            if(i>=0)n1=Integer.parseInt(s1.charAt(i)+"");
            if(j>=0)n2=Integer.parseInt(s2.charAt(j)+"");
            sum+=n1+n2;
            ans.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        ans=ans.reverse();
        return ans.toString();
    }
    public String multiply(String nu, String de) {
        int t=0;
        String sum="0";
        if(nu.equals("0") || de.equals("0"))return "0";
        for (int j = de.length() - 1; j >= 0; j--) {
        StringBuilder ans = new StringBuilder();
            int carry = 0;
            for (int i = nu.length() - 1; i >= 0; i--) {
                int n = Integer.parseInt(nu.charAt(i) + "");
                int d = Integer.parseInt(de.charAt(j) + "");
                int mul = carry;
                mul += d * n;
                ans.append(mul % 10);
                carry = mul / 10;
            }
            if (carry > 0)
                ans.append(carry);
            ans = ans.reverse();
            for(int k=0;k<t;k++)
                ans.append("0");
            t++;
            sum=sum(sum,ans.toString());
        }
        return sum;
    }
}