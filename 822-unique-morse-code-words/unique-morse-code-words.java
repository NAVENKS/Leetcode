class Solution {
    String[] map ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        
        Set<String> set = new HashSet<>();
        for(String word: words){
            set.add(transform(word));
        }

        return set.size();
    }

    public String transform(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(map[s.charAt(i) - 'a']);
        }
        return sb.toString();
    }
}