class Solution {
    public int removeDuplicates(int[] n) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<n.length;i++){
            set.add(n[i]);
        }
        int c=0;
        for(int a:set){
            n[c++]=a;
        }
        return c;
    }
}