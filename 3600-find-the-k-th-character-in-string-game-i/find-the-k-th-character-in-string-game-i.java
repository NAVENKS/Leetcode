class Solution {
    public char kthCharacter(int k) {
        int pow=1,c=0;
        while(pow<k){
            pow*=2;
        }
        pow/=2;
        while(k>1){
            if(pow<k){
                k-=pow;
                c++;
            }
            else{
                pow/=2;
            }
        }
        return (char)('a'+c);
    }
}