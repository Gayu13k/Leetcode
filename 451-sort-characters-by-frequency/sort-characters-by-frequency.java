class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map=new HashMap<>();
        StringBuilder sb= new StringBuilder();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        /*for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>2){
                sb.append(entry.getKey());
            }
            else if(entry.getValue()>1){
                sb.append(entry.getKey());
            }
            else{
                  sb.append(entry.getKey());
            }
        }*/
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        while(!pq.isEmpty()){
            char ch=pq.poll();
            int freq=map.get(ch);
            for(int i =0;i<freq;i++){
                sb.append(ch);
            }
        }

        
        return sb.toString();
    }
}