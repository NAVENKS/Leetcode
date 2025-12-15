class Solution {
    public int uniqueMorseRepresentations(String[] w) {
        String c[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<w.length;i++){
            StringBuilder s=new StringBuilder();
            for(int j=0;j<w[i].length();j++){
                int in=w[i].charAt(j)-97;
                s.append(c[in]);
            }
            map.put(s.toString(),map.getOrDefault(s.toString(),0)+1);
        }
        return map.size();
    }
}