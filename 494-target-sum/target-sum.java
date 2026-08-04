class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(0,nums,0,target);
    }
    public static int backtrack(int index, int nums[], int sum ,int target){
        if(index==nums.length){
            if(sum==target) return 1;
            else return 0;
        }
        int add=backtrack(index+1,nums,sum+nums[index],target);
        int subtract=backtrack(index+1,nums,sum-nums[index],target);
        return add+subtract;
    }
}