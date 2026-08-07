class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i =left;i<=right;i++){
            int n =i;
            boolean seen=true;
            while(n!=0){
                int dig=n%10;
                if(dig==0||i%dig!=0){
                    seen=false;;
                }
                n/=10;
               
            }
             if(seen){
                    list.add(i);
                }

        }
        return list;
    }
}