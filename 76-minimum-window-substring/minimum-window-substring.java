class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> fre = new HashMap<>();
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> con = new HashMap<>();
        for(char ch:t.toCharArray()){
            fre.put(ch,fre.getOrDefault(ch,0)+1);
            map.put(ch,0);
        }
        int l=0;
        int st=0;
        int e=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(fre.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                if(map.get(ch)>=fre.get(ch))
                con.put(ch,1);
            }
            while(fre.size()==con.size() && l<s.length()){
                char c=s.charAt(l);
                if(map.containsKey(c))
                {map.put(c,map.get(c)-1);
                if(map.get(c)<fre.get(c)){
                    map.put(c,map.get(c)+1);
                    break;
                }}
                l++;
            }
            if(fre.size()==con.size()){
                if((i-l)<(e-st)){
                    st=l;
                    e=i;
                }
            }
        }
        System.out.print(st+" "+e);
        if(e==Integer.MAX_VALUE)return "";
        return s.substring(st,e+1);
    }
}