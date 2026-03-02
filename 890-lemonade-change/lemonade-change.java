class Solution {
    public boolean lemonadeChange(int[] arr) {
        int five=0,ten=0;
        if(arr[0]!=5)return false;
        for(int cost:arr){
            if(cost==5)five++;
            else if(cost==10){
                ten++;
                if(five>0)five--;
                else return false;
            }
            else if(cost==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>=3)
                five=five-3;
                else return false;
            }
        }
        return true;
    }
}