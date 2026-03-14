class Solution {
    public boolean wordPattern(String p, String s) {
        String arr[]=s.split("\\\s+");
        // System.out.print(p.length()+" "+arr.length);
        if(p.length()!=arr.length)return false;
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> has = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char c = p.charAt(i);
            if(!has.containsKey(arr[i])){
                map.put(c,arr[i]);
                has.put(arr[i],c);
            }
        }
        for(int i=0;i<arr.length;i++){
            char c = p.charAt(i);
            if(!map.containsKey(c) || !map.get(c).equals(arr[i]))return false;
        }
        return true;
    }
}