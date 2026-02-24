class Solution {
    public int minSwaps(String s) {
        int open=0,imbalance=0;
        for(char ch:s.toCharArray()){
            if(ch=='[')
            open++;
            else{
                if(open>0)
                open--;
                else
                imbalance++;
            }
        }
        return (imbalance+1)/2;
    }
}