class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map=new HashMap<>();
        String word[]=s.split(" ");
        if(pattern.length()!=word.length) return false;
        for(int i =0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(word[i])){
                    return false;
                }
               map.put(pattern.charAt(i),word[i]);
            }
            
        }
          for(int i =0;i<pattern.length();i++){
          if(!map.get(pattern.charAt(i)).equals(word[i])){
            return false;
          }
          }
          return true;
    }
}