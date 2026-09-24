class Solution {
    public int smallestIndex(int[] nums) {
        int ans=100;
        for(int i =0;i<nums.length;i++){
            int n =nums[i];
            int sum=0;
            while(n!=0){
                int dig=n%10;
                sum+=dig;
                n/=10;
            }
            if(sum==i){
              ans=Math.min(i,ans);
            }
        }
        if(ans<nums.length){
          return ans;
        }
       return -1;
    }
}