class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstpos(nums,target);
        int last=lastpos(nums,target);
        return new int[]{first,last};
    }
        /*int start =-1,end=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) {
                if(start==-1){
                    start=i;
                }
                end =i;
                   
                }
            }
        return new int[]{start,end};*/
          public  int firstpos(int nums[],int target){
            int left=0;
            int right=nums.length-1;
            int ans=-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums[mid]==target){
                    ans=mid;
                    right=mid-1;
                }
                else if(nums[mid]<target)  left=mid+1;
                else   right=mid-1;
                
            }
            return ans;
          }
          public int lastpos(int nums[],int target){
             int left=0;
            int right=nums.length-1;
            int ans=-1;
            while(left<=right){
                 int mid=left+(right-left)/2;
                if(nums[mid]==target){
                    ans=mid;
                    left=mid+1;
                }
                else if(nums[mid]<target) left=mid+1;
                else   right=mid-1;  
            }
            return ans;
        }
        
        
    }
