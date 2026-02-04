class Solution {
    public int minOperations(String[] l) {
        int j=0;
        for(int i=0;i<l.length;i++){
            if(j>0 && l[i].equals("../"))
            j--;
            else if(l[i].equals("./"))
            continue;
            else if(!l[i].equals("./") && !l[i].equals("../"))
            j++;
        }
        return j;
    }
}