class Solution {
    public String originalDigits(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int [] order_array_int={0,2,4,5,6,7,8,9,1,3};
        int fre[]=new int [10];
        char [] order_array_char={'z','w','u','f','x','s','g','i','o','t'};
        int correct_number[]={0,2,4,5,6,7,8,9,1,3};
        String []digit_in_words={"zero","two","four","five","six","seven","eight","nine","one","three"};
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<order_array_char.length;i++){
            String word=digit_in_words[i];
            char ch=order_array_char[i];
            while(map.containsKey(ch)){
                for(int j=0;j<word.length();j++){
                    char c=word.charAt(j);
                    map.put(c,map.get(c)-1);
                    if(map.get(c)==0)
                    map.remove(c);
                }
                fre[correct_number[i]]++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<fre.length;i++){
            ans.append(String.valueOf(i).repeat(fre[i]));
        }
        return ans.toString();
    }
}