class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        HashMap<String,Integer> fre = new HashMap<>();
        for(String w : words){
            fre.put(w, fre.getOrDefault(w,0)+1);
        }

        int wordLen = words[0].length();
        int wordCount = words.length;

        for(int i = 0; i < wordLen; i++){

            HashMap<String,Integer> map = new HashMap<>();
            int left = i;
            int count = 0;

            for(int right = i; right + wordLen <= s.length(); right += wordLen){

                String word = s.substring(right, right + wordLen);

                if(fre.containsKey(word)){

                    map.put(word, map.getOrDefault(word,0)+1);
                    count++;

                    while(map.get(word) > fre.get(word)){
                        String leftWord = s.substring(left, left + wordLen);
                        map.put(leftWord, map.get(leftWord)-1);
                        left += wordLen;
                        count--;
                    }

                    if(count == wordCount)
                        ans.add(left);

                } 
                else{

                    map.clear();
                    count = 0;
                    left = right + wordLen;

                }
            }
        }

        return ans;
    }
}