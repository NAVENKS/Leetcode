class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            if(n==1)return true;
            int next=0;
            while(n!=0){
                int l=n%10;
                l*=l;
                next+=l;
                n/=10;
            }
            if(!set.add(next))return false;
            n=next;
        }
    }
}