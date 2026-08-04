class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> list=new ArrayList<>();
         Arrays.sort(nums);
         
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Two pointers initialization
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicate values for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicate values for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers inward after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, move left pointer to increase the sum
                    left++;
                } else {
                    // Sum is too big, move right pointer to decrease the sum
                    right--;
                }
            }
        }
        return list;
    }
}