class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        leftsum[0]=0;
        rightsum[rightsum.length-1]=0;
        int ans[]=new int[nums.length];
        
        int lsum=0;
        for(int i =0;i<nums.length-1;i++){
           lsum=lsum+nums[i] ;
          leftsum[i+1]=lsum;
     
        }
          
           int rsum=0;
         for(int i =nums.length-1;i>0;i--){
         rsum=rsum+nums[i];
         rightsum[i-1]=rsum;
         
        }
        for(int i =0;i<nums.length;i++){
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
    }
}