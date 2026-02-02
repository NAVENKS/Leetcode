class Solution {
    public int findDuplicate(int[] n) {
        int slow=n[0];
        int fast=n[0];
        do{
            slow=n[slow];
            fast=n[n[fast]];
        }while(slow!=fast);
        slow=n[0];
        while(slow!=fast){
            slow=n[slow];
            fast=n[fast];
        }
        return slow;
    }
}