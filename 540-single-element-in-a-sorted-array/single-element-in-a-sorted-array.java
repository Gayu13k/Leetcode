class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer>map=new HashMap<>();
        int ans=0;
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}