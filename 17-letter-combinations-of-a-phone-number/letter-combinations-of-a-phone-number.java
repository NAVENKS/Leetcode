class Solution {
    HashMap<Character,List<Character>>map=new HashMap<>();
    List<String>ans=new ArrayList<>();
    public void phone(int i,String digits,StringBuilder str){
        if(str.length()==digits.length()){
            ans.add(new String(str.toString()));
            return;
        }
        for(int j=i;j<digits.length();j++){
            List<Character>curr_digit=map.get(digits.charAt(j));
            for(char letter:curr_digit){
                str.append(letter);
                phone(j+1,digits,str);
                str.deleteCharAt(str.length()-1);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        map.put('2',new ArrayList<>(Arrays.asList('a','b','c')));
        map.put('3',new ArrayList<>(Arrays.asList('d','e','f')));
        map.put('4',new ArrayList<>(Arrays.asList('g','h','i')));
        map.put('5',new ArrayList<>(Arrays.asList('j','k','l')));
        map.put('6',new ArrayList<>(Arrays.asList('m','n','o')));
        map.put('7',new ArrayList<>(Arrays.asList('p','q','r','s')));
        map.put('8',new ArrayList<>(Arrays.asList('t','u','v')));
        map.put('9',new ArrayList<>(Arrays.asList('w','x','y','z')));
        phone(0,digits,new StringBuilder());
        return ans;
    }
}