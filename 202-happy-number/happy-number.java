class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        while(sum!=1){
            sum=0;
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            if(map.containsKey(sum))
            return false;
            map.put(sum,1);
            n=sum;
        }
        return true;
    }
}