class Solution {
    public int[] findDegrees(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        
        for(int i=0;i<matrix[0].length;i++){
            int count=0;
            for(int j =0;j<matrix[i].length;j++){
             if(matrix[i][j]==1){
                count++;
             }
            }
            list.add(count);
        }
        int ans[]=new int[list.size()];
        int i=0;
        for(int n:list){
           ans[i++]=n;
        }
        return ans;
    }
}