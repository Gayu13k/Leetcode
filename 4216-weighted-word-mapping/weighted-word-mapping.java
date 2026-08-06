class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word:words){
            int sum=0;
            for(char ch:word.toCharArray()){
            sum+=weights[ch-'a'];
        }
        int val=sum%26;
        char res=(char)('z'-val);
        sb.append(res);
        }
       return sb.toString();
    }
}