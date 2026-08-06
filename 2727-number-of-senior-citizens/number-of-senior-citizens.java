class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String word:details){
          if(Integer.parseInt(word.substring(11,13))>60)  count++;
        }
        return count;
    }
}