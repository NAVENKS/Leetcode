class Solution {
    public boolean containsNearbyDuplicate(int[] n, int k) {
        HashMap<Integer,Integer> index = new HashMap<>();
        for(int i=0;i<n.length;i++){
            if(index.containsKey(n[i])){
                if(Math.abs(index.get(n[i])-i)<=k)
                return true;
                index.put(n[i],i);
            }
            else
            index.put(n[i],i);
        }
        return false;
    }
}