class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char c[]=arr[i].toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(arr[i]);
        }
        return new ArrayList<>(map.values());
    }
}