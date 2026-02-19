class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int i=a.length()-1,j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int sum=carry;
            if(i>=0){
                sum+=Integer.parseInt(a.charAt(i)+"");
            }
            if(j>=0){
                sum+=Integer.parseInt(b.charAt(j)+"");
            }
            if(sum==3){
                carry=1;
                ans.append(1);
            }
            else if(sum==2){
                carry=1;
                ans.append(0);
            }
            else{
                carry=0;
                ans.append(sum);
            }
            i--;
            j--;
        }
        i=0;
        j=ans.length()-1;
        while(i<j){
            char ch=ans.charAt(i);
            ans.setCharAt(i,ans.charAt(j));
            ans.setCharAt(j,ch);
            j--;
            i++;
        }
        return ans.toString();
    }
}