class Solution {
    public boolean canConstruct(String a, String b) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:a.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:b.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                map.remove(c);
            }
        }
        return map.size()==0;
    }
}