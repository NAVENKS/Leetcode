class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("\\s+","");
        s=s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                str.append(s.charAt(i)+"");
            }
        }
        int i=0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}